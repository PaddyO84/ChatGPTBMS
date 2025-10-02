package com.justwork.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.justwork.app.ui.CustomersFragment
import com.justwork.app.ui.JobsFragment
import com.justwork.app.ui.TasksFragment

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
