package com.example.dagger2

import android.app.Application
import javax.inject.Inject

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent
    }
}