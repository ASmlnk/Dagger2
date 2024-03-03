package com.example.data

import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDatabase(): Database {
        return Database()
    }
}