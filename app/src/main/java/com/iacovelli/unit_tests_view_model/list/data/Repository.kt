package com.iacovelli.unit_tests_view_model.list.data

interface Repository {
    fun getData(): List<String>
}

class RepositoryImpl: Repository {

    override fun getData(): List<String> {
        return listOf(
            "Cesar",
            "Douglas",
            "Julio",
            "Rodrigo",
            "Victor",
            "Uzias"
        )
    }
}