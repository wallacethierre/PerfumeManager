package com.djaca.android.perfumemanager.core.repository

import com.djaca.android.perfumemanager.core.data.Perfume

class PerfumeRepository(private val dataSource: IPerfumeDataSource) {
    suspend fun addPerfume(perfume: Perfume) = dataSource.add(perfume)
    suspend fun getPerfume(id: Long) = dataSource.getById(id)
    suspend fun listAllPerfume() = dataSource.listAll()
    suspend fun deletePerfume(perfume: Perfume) = dataSource.remove(perfume)
}