package com.iacovelli.unit_tests_view_model.list.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.iacovelli.unit_tests_view_model.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    private lateinit var viewModel: ListViewModel
    private val factory = ListViewModel.Factory()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        viewModel = ViewModelProviders.of(this, factory).get(ListViewModel::class.java)
        setupObservers()
        setupListAdapter()
        viewModel.fetchData()
    }

    private fun setupListAdapter() {
        namesList.adapter = ListAdapter()
    }

    private fun setupObservers() {
        viewModel.onDataLoaded.observe(this, Observer {
            (namesList.adapter as ListAdapter).setData(it)
        })
    }
}
