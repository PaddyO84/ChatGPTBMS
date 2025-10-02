
package com.example.bms.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import android.util.Log

class ReminderWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        Log.d("ReminderWorker", "Reminder triggered")
        return Result.success()
    }
}
