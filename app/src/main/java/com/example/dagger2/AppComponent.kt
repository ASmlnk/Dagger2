package com.example.dagger2

import com.example.data.DataModule
import dagger.Component

@Component(modules = [DataModule::class])
interface AppComponent {

    fun injectTaskActivity(taskActivity: TaskActivity)
}