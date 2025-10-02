package com.justwork.app.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.justwork.app.data.AppDatabase
import com.justwork.app.data.TaskDao

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        // If a prepackaged database file exists in assets/databases/sample.db, Room can use it via createFromAsset
        return Room.databaseBuilder(appContext, AppDatabase::class.java, "justwork.db")
            .createFromAsset("databases/sample.db")
            .build()
    }

    @Provides
    fun provideTaskDao(db: AppDatabase): TaskDao = db.taskDao()
}
