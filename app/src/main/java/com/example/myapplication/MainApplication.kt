package com.example.myapplication

import android.app.Application
import android.content.Context
import android.util.Log

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        Log.v("kkk","chuj")
    }

    companion object {
        lateinit var appContext: Context
    }
}
