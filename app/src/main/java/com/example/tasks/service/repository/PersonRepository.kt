package com.example.tasks.service.repository

import com.example.tasks.service.repository.remote.PersonService
import com.example.tasks.service.repository.remote.RetrofirClient

class PersonRepository {

    val remote = RetrofirClient.createService(PersonService::class.java)

    fun login(email: String, password: String) {

    }

}