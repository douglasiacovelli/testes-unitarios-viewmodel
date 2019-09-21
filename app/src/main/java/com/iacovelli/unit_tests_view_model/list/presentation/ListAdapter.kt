package com.iacovelli.unit_tests_view_model.list.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iacovelli.unit_tests_view_model.R

class ListAdapter: RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private val data: MutableList<String> = mutableListOf()

    fun setData(newData: List<String>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_name, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val nameTextView = view.findViewById<TextView>(R.id.name)

        fun bindData(name: String) {
            nameTextView.text = name
        }
    }

}