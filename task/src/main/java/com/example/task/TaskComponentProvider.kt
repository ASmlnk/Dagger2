package com.example.task

//интерфейс для App
//от него нужно, чтобы он умел предоставлять TaskComponent
interface TaskComponentProvider {
    fun getTaskComponent(): TaskComponent
}