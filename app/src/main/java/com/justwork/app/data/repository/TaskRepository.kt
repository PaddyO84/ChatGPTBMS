package com.justwork.app.data.repository

import com.justwork.app.data.local.dao.TaskDao
import com.justwork.app.data.local.entities.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val dao: TaskDao) {
    fun getTasksForJob(jobId: Long): Flow<List<Task>> = dao.getTasksForJob(jobId)
    suspend fun insert(task: Task) = dao.insert(task)
    suspend fun update(task: Task) = dao.update(task)
    suspend fun delete(task: Task) = dao.delete(task)
}
