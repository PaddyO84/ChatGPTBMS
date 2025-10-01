package com.example.bms.data.repository

import com.example.bms.data.local.dao.CustomerDao
import com.example.bms.data.local.entities.Customer
import kotlinx.coroutines.flow.Flow

class CustomerRepository(private val dao: CustomerDao) {
    val allCustomers: Flow<List<Customer>> = dao.getAllCustomers()
    suspend fun insert(customer: Customer) = dao.insert(customer)
    suspend fun update(customer: Customer) = dao.update(customer)
    suspend fun delete(customer: Customer) = dao.delete(customer)
    fun getCustomerById(id: Long): Flow<Customer> = dao.getCustomerById(id)
}
