package com.djaca.android.perfumemanager.core.repository

import com.djaca.android.perfumemanager.core.data.Perfume

interface IPerfumeDataSource {
    suspend fun add(perfume: Perfume)
    suspend fun getById(ind: Long): Perfume?
    suspend fun listAll(): List<Perfume>
    suspend fun remove(perfume: Perfume)
}