package com.justwork.app.data.local.dao

import androidx.room.*
import com.justwork.app.data.local.entities.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert suspend fun insert(task: Task): Long
    @Update suspend fun update(task: Task)
    @Delete suspend fun delete(task: Task)
    @Query("SELECT * FROM tasks WHERE jobId = :jobId ORDER BY id ASC") fun getTasksForJob(jobId: Long): Flow<List<Task>>
    @Query("SELECT * FROM tasks WHERE id = :id") fun getTaskById(id: Long): Flow<Task>
}
