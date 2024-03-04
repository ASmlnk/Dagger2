package com.example.dagger2

import android.app.Application
import com.example.task.TaskComponent
import com.example.task.TaskComponentDependencies
import com.example.task.TaskComponentDependenciesProvider
import com.example.task.TaskComponentProvider
import javax.inject.Inject

class App : Application(), TaskComponentDependenciesProvider {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        // appComponent = DaggerAppComponent.create()
        // appComponent = DaggerAppComponent.factory().create(this)

        // appComponent = MyAppComponent()
        appComponent = MyAppComponent(this)
    }

    override fun getTaskComponentDependencies(): TaskComponentDependencies {
        return appComponent
    }
}