package com.example.network

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideTaskApi(): TaskApi {
        return object : TaskApi {}
    }
}