package com.justwork.app.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.hilt.work.HiltWorker
import javax.inject.Inject
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.justwork.app.R

@HiltWorker
class ReminderWorker @Inject constructor(
    @androidx.annotation.NotNull context: Context,
    @androidx.annotation.NotNull workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        try {
            showNotification("JustWork Reminder", "You have scheduled tasks to check.")
            return Result.success()
        } catch (t: Throwable) {
            return Result.failure()
        }
    }

    private fun showNotification(title: String, message: String) {
        val notification = NotificationCompat.Builder(applicationContext, "justwork_channel")
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()
        val nm = NotificationManagerCompat.from(applicationContext)
        nm.notify(1001, notification)
    }
}
