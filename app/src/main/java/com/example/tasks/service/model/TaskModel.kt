package com.example.tasks.service.model

import com.google.gson.annotations.SerializedName

class TaskModel {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("PriorityId")
    var PriorityId: Int = 0

    @SerializedName("description")
    var description : String = ""

    @SerializedName("DueDate")
    var dueDate : String = ""

    @SerializedName("Complete")
    var complete : Boolean = false


}