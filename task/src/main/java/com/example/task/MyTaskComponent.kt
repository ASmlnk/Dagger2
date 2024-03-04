package com.example.task

import com.example.network.NetworkModule

class MyTaskComponent(
    private val taskComponentDependencies: TaskComponentDependencies
): TaskComponent {

    private val networkModule: NetworkModule = NetworkModule()
    private val taskModule: TaskModule = TaskModule()

    override fun injectTaskFragment(taskFragment: TaskFragment) {
        taskFragment.taskRepository = taskModule.provideTaskRepository(
            taskComponentDependencies.getDatabase(),
            networkModule.provideTaskApi()
        )
    }
}