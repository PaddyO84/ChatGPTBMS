package com.example.bms.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class Customer(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val companyName: String,
    val email: String,
    val phoneNumbers: String,
    val roleTitle: String
)
