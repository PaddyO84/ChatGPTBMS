package com.justwork.app

import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.app.helpers.CsvHelper
import com.example.app.helpers.PdfHelper
import com.example.app.workers.ReminderWorker
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.justwork.app.ui.CustomersFragment
import com.justwork.app.ui.JobsFragment
import com.justwork.app.ui.TasksFragment
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.container, CustomersFragment.newInstance())
            }
        }

        nav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_customers -> supportFragmentManager.commit { replace(R.id.container, CustomersFragment.newInstance()) }
                R.id.nav_jobs -> supportFragmentManager.commit { replace(R.id.container, JobsFragment.newInstance()) }
                R.id.nav_tasks -> supportFragmentManager.commit { replace(R.id.container, TasksFragment.newInstance()) }
            }
            true
        }
    }
}

@HiltAndroidApp
class JustWorkApplication : Application() {
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