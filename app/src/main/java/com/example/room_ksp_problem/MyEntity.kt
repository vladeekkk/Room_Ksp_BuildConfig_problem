package com.example.room_ksp_problem

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyEntity(
    @PrimaryKey
    val kek: String = ""
)
