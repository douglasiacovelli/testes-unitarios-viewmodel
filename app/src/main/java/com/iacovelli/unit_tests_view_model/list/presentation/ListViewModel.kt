package com.iacovelli.unit_tests_view_model.list.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.iacovelli.unit_tests_view_model.list.data.Repository
import com.iacovelli.unit_tests_view_model.list.data.RepositoryImpl

class ListViewModel(private val repository: Repository): ViewModel() {

    val onDataLoaded = MutableLiveData<List<String>>()

    fun fetchData() {
        val namesList = repository.getData()
        onDataLoaded.value = namesList
    }

    @Suppress("UNCHECKED_CAST")
    class Factory: ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ListViewModel(RepositoryImpl()) as T
        }
    }
}