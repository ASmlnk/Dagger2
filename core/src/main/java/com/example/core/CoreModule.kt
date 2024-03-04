package com.example.core

import dagger.Module
import dagger.Provides

@Module
class CoreModule {

    @Provides
    fun provideFileManager() = FileManager()
}