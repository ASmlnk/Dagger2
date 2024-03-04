package com.example.dagger2

import android.content.Context
import com.example.core.CoreModule
import com.example.core.FileManager
import com.example.data2.DataModule
import com.example.data2.Database
import com.example.network.NetworkModule
import com.example.task.TaskComponent
import com.example.task.TaskFragment
import com.example.task.TaskModule

class MyAppComponent(private val context: Context): AppComponent {

    private val dataModule = DataModule()
    private val coreModule = CoreModule()

    override fun getDatabase(): Database {
        return dataModule.provideDatabase(context, coreModule.provideFileManager())
    }

    override fun injectTaskActivity(taskActivity: TaskActivity) {
        taskActivity.database = dataModule.provideDatabase(context, coreModule.provideFileManager())
    }
}