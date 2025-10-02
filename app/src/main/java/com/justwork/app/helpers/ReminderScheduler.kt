package com.justwork.app.helpers

import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit
import com.justwork.app.workers.ReminderWorker
import android.content.Context

object ReminderScheduler {
    fun scheduleDailyReminder(context: Context) {
        val req = PeriodicWorkRequestBuilder<ReminderWorker>(24, TimeUnit.HOURS)
            .build()
        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            "justwork_reminder",
            ExistingPeriodicWorkPolicy.KEEP,
            req
        )
    }
}
