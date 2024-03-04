package com.example.task

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.data2.Database
import javax.inject.Inject

class TaskFragment: Fragment() {

    @Inject
    lateinit var database: Database
    lateinit var taskRepository: TaskRepository

    override fun onAttach(context: Context) {
        super.onAttach(context)

        /*(context.applicationContext as TaskComponentProvider)
            .getTaskComponent()
            .injectTaskFragment(this)*/

        val taskComponentDependencies = (context.applicationContext as TaskComponentDependenciesProvider)
            .getTaskComponentDependencies()
        val taskComponent = MyTaskComponent(taskComponentDependencies)
        taskComponent.injectTaskFragment(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

    }
}