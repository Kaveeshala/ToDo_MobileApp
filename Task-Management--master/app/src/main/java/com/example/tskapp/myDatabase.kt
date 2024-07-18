package com.example.tskapp

import androidx.room.Database
import androidx.room.RoomDatabase

//represent and manage the SQLite database in my Android application using the Room Persistence Library
@Database(entities = [Entity::class],version=1)
abstract class myDatabase : RoomDatabase() {
    abstract fun dao():DAO
}