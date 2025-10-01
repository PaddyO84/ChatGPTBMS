package com.example.bms.ui.task

import androidx.lifecycle.*
import com.example.bms.data.local.entities.Task
import com.example.bms.data.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TaskViewModel @Inject constructor(private val repository: TaskRepository) : ViewModel() {
    fun getTasksForJob(jobId: Long): LiveData<List<Task>> = repository.getTasksForJob(jobId).asLiveData()
    fun addTask(task: Task) = viewModelScope.launch { repository.insert(task) }
    fun updateTask(task: Task) = viewModelScope.launch { repository.update(task) }
    fun deleteTask(task: Task) = viewModelScope.launch { repository.delete(task) }
}
