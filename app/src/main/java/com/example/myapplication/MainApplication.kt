package com.example.myapplication

import android.app.Application
import android.content.Context
import android.util.Log
import com.example.myapplication.data.User

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }

    companion object {
        lateinit var appContext: Context
        lateinit var currentUser: User
    }
}
