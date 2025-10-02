
package com.example.bms

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit
import com.example.bms.workers.ReminderWorker
import com.example.bms.helpers.PdfHelper
import com.example.bms.helpers.CsvHelper

@HiltAndroidApp
class BMSApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Schedule periodic reminders every 1 hour
        val workRequest = PeriodicWorkRequestBuilder<ReminderWorker>(1, TimeUnit.HOURS).build()
        WorkManager.getInstance(this).enqueue(workRequest)

        // Generate sample PDF & CSV on app launch
        PdfHelper(this).generateInvoice("sample_invoice.pdf")
        CsvHelper(this).generateSampleCsv("sample_data.csv")
    }
}
