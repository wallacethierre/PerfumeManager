package com.djaca.android.perfumemanager.core.useCase

import com.djaca.android.perfumemanager.core.repository.IPerfumeDataSource

class GetPerfumeByID(private val repository: IPerfumeDataSource) {
    suspend operator fun invoke(id: Long) = repository.getById(id)
}