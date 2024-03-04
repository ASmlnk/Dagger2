package com.example.task

import com.example.data2.Database
import com.example.network.TaskApi
import dagger.Module
import dagger.Provides

@Module
class TaskModule {

    @Provides
    fun provideTaskRepository(database: Database, taskApi: TaskApi): TaskRepository {
        return TaskRepository(database,taskApi)
    }
}