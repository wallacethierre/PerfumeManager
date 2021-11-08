package com.djaca.android.perfumemanager.framework.dataBase

import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import com.djaca.android.perfumemanager.core.data.Perfume

interface PerfumeDao {
    @Insert(onConflict = REPLACE)
    suspend fun addPerfume(perfume: Perfume)

//    @Query
//    TODO suspend fun getPerfumeByID(id: Long)
}