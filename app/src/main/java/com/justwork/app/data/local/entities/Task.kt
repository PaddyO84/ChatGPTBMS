package com.justwork.app.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val jobId: Long,
    val type: String,
    val description: String,
    val durationHours: Float,
    val cost: Float,
    val vendor: String
)
