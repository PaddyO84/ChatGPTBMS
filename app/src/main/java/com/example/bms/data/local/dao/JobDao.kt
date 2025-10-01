package com.example.bms.data.local.dao

import androidx.room.*
import com.example.bms.data.local.entities.Job
import kotlinx.coroutines.flow.Flow

@Dao
interface JobDao {
    @Insert suspend fun insert(job: Job): Long
    @Update suspend fun update(job: Job)
    @Delete suspend fun delete(job: Job)
    @Query("SELECT * FROM jobs ORDER BY requestedDate ASC") fun getAllJobs(): Flow<List<Job>>
    @Query("SELECT * FROM jobs WHERE id = :id") fun getJobById(id: Long): Flow<Job>
}
