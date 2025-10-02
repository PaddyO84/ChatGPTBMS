package com.justwork.app.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lcom/justwork/app/data/TaskDao;", "", "getAll", "", "Lcom/justwork/app/data/TaskEntity;", "insert", "", "task", "app_debug"})
@androidx.room.Dao
public abstract interface TaskDao {
    
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.justwork.app.data.TaskEntity> getAll();
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.justwork.app.data.TaskEntity task);
}