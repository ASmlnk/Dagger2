package com.example.data2

import android.content.Context
import com.example.core.FileManager
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDatabase(context: Context, fileManager: FileManager): Database {
        return Database(context, fileManager)
    }
}