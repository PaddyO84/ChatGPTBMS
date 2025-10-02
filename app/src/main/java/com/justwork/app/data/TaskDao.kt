package com.justwork.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks ORDER BY id DESC")
    fun getAll(): List<TaskEntity>

    @Insert
    fun insert(task: TaskEntity)
}
