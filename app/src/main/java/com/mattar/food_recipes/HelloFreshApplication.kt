package com.mattar.food_recipes

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