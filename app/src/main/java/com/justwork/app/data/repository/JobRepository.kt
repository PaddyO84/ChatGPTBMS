package com.justwork.app.data.repository

import com.justwork.app.data.local.dao.JobDao
import com.justwork.app.data.local.entities.Job
import kotlinx.coroutines.flow.Flow

class JobRepository(private val dao: JobDao) {
    val allJobs: Flow<List<Job>> = dao.getAllJobs()
    suspend fun insert(job: Job) = dao.insert(job)
    suspend fun update(job: Job) = dao.update(job)
    suspend fun delete(job: Job) = dao.delete(job)
    fun getJobById(id: Long): Flow<Job> = dao.getJobById(id)
}
