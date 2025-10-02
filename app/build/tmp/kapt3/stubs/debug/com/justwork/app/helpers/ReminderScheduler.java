package com.justwork.app.helpers;

import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.WorkManager;
import java.util.concurrent.TimeUnit;
import com.justwork.app.workers.ReminderWorker;
import android.content.Context;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/justwork/app/helpers/ReminderScheduler;", "", "()V", "scheduleDailyReminder", "", "context", "Landroid/content/Context;", "app_debug"})
public final class ReminderScheduler {
    @org.jetbrains.annotations.NotNull
    public static final com.justwork.app.helpers.ReminderScheduler INSTANCE = null;
    
    private ReminderScheduler() {
        super();
    }
    
    public final void scheduleDailyReminder(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}