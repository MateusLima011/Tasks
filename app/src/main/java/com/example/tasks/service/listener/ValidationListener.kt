package com.example.tasks.service.listener

class ValidationListener (str: String = ""){

    private var status: Boolean = true
    private var message : String = ""

    init {
        if (str != ""){
            status = false
            message = str
        }
    }

    fun success() = status
    fun failure() = message

}