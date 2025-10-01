package com.example.bms.ui.job

import androidx.lifecycle.*
import com.example.bms.data.local.entities.Job
import com.example.bms.data.repository.JobRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JobViewModel @Inject constructor(private val repository: JobRepository) : ViewModel() {
    val jobs: LiveData<List<Job>> = repository.allJobs.asLiveData()
    fun addJob(job: Job) = viewModelScope.launch { repository.insert(job) }
    fun updateJob(job: Job) = viewModelScope.launch { repository.update(job) }
    fun deleteJob(job: Job) = viewModelScope.launch { repository.delete(job) }
    fun getJobById(id: Long) = repository.getJobById(id).asLiveData()
}
