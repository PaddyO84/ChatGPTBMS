
package com.example.bms

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import com.example.bms.fragments.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.nav_customer -> openFragment(CustomerFragment())
                R.id.nav_job -> openFragment(JobFragment())
                R.id.nav_task -> openFragment(TaskFragment())
                R.id.nav_settings -> openFragment(SettingsFragment())
            }
            true
        }
        openFragment(CustomerFragment())
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
