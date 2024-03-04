package com.example.task

import com.example.network.NetworkModule
import dagger.Component
import dagger.Subcomponent

// интерфейс - для компонента
// от него нам нужно только, чтобы он умел инджектить в наш фрагмент

@Component(modules = [NetworkModule::class, TaskModule::class], dependencies = [TaskComponentDependencies::class])
interface TaskComponent {
    fun injectTaskFragment(taskFragment: TaskFragment)
}