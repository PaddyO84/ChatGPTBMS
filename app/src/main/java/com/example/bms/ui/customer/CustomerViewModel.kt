package com.example.bms.ui.customer

import androidx.lifecycle.*
import com.example.bms.data.local.entities.Customer
import com.example.bms.data.repository.CustomerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CustomerViewModel @Inject constructor(private val repository: CustomerRepository) : ViewModel() {
    val customers: LiveData<List<Customer>> = repository.allCustomers.asLiveData()
    fun addCustomer(customer: Customer) = viewModelScope.launch { repository.insert(customer) }
    fun updateCustomer(customer: Customer) = viewModelScope.launch { repository.update(customer) }
    fun deleteCustomer(customer: Customer) = viewModelScope.launch { repository.delete(customer) }
    fun getCustomerById(id: Long) = repository.getCustomerById(id).asLiveData()
}
