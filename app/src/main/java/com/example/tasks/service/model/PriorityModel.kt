package com.example.tasks.service.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "priority")
class PriorityModel {

    @SerializedName("id")
    @ColumnInfo(name = "id")
    @PrimaryKey
    var id: Int = 0

    @SerializedName("description")
    @ColumnInfo(name = "description")
    var description : String = ""

}