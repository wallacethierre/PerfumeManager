package com.djaca.android.perfumemanager.framework.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [], version = 1)
abstract class DataBaseService: RoomDatabase() {

    // Companion object store all variables and method static of this class
    companion object {

    }

    abstract fun perfumeDao(): PerfumeDao
}