package com.example.mvvmtodoapp.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmtodoapp.data.TodoDao
import com.example.mvvmtodoapp.data.TodoDatabase
import com.example.mvvmtodoapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.example.mvvmtodoapp.data.TodoRepository
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.todoDao)
    }
}