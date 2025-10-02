package com.justwork.app.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import com.justwork.app.data.TaskDao;
import com.justwork.app.data.TaskEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/justwork/app/viewmodels/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/justwork/app/data/TaskDao;", "(Lcom/justwork/app/data/TaskDao;)V", "allTasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/justwork/app/data/TaskEntity;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.justwork.app.data.TaskDao dao = null;
    
    @javax.inject.Inject
    public TasksViewModel(@org.jetbrains.annotations.NotNull
    com.justwork.app.data.TaskDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.justwork.app.data.TaskEntity>> allTasks() {
        return null;
    }
}