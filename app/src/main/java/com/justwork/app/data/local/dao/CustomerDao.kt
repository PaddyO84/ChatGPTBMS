package com.justwork.app.data.local.dao

import androidx.room.*
import com.justwork.app.data.local.entities.Customer
import kotlinx.coroutines.flow.Flow

@Dao
interface CustomerDao {
    @Insert suspend fun insert(customer: Customer): Long
    @Update suspend fun update(customer: Customer)
    @Delete suspend fun delete(customer: Customer)
    @Query("SELECT * FROM customers ORDER BY name ASC") fun getAllCustomers(): Flow<List<Customer>>
    @Query("SELECT * FROM customers WHERE id = :id") fun getCustomerById(id: Long): Flow<Customer>
}
