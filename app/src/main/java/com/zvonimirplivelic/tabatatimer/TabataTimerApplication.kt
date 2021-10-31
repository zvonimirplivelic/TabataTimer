package com.zvonimirplivelic.tabatatimer

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class TabataTimerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(DebugTree())
    }
}