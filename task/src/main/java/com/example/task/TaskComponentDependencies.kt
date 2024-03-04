package com.example.task

import com.example.data2.Database

interface TaskComponentDependencies {
    fun getDatabase(): Database
}