package com.example.dagger2

import android.content.Context
import com.example.core.CoreModule
import com.example.core.FileManager
import com.example.data2.DataModule
import com.example.data2.Database
import com.example.network.NetworkModule
import com.example.task.TaskComponent
import com.example.task.TaskComponentDependencies
import com.example.task.TaskFragment
import com.example.task.TaskModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, CoreModule::class])
interface AppComponent: TaskComponentDependencies {

    fun injectTaskActivity(taskActivity: TaskActivity)

    override fun getDatabase(): Database

    @Component.Factory
    interface AppComponentFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}