package com.mattar.osama_mattar_android_test

import android.app.Application
import android.content.Context

class HelloFreshApplication : Application() {
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}