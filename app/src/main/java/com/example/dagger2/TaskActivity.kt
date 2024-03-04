package com.example.dagger2

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.data2.Database
import javax.inject.Inject

class TaskActivity: AppCompatActivity() {

    @Inject
    lateinit var database: Database

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_task)
        (application as App).appComponent.injectTaskActivity(this)
    }
}