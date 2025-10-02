package com.justwork.app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.justwork.app.data.TaskDao
import com.justwork.app.data.TaskEntity

@HiltViewModel
class TasksViewModel @Inject constructor(private val dao: TaskDao): ViewModel() {
    fun allTasks(): LiveData<List<TaskEntity>> = liveData {
        emit(dao.getAll())
    }
}
