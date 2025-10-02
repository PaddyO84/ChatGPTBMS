package com.justwork.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BMSApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // App-wide initialization
    }
}
