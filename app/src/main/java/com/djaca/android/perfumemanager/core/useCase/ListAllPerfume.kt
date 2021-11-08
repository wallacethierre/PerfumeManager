package com.djaca.android.perfumemanager.core.useCase

import com.djaca.android.perfumemanager.core.repository.IPerfumeDataSource

class ListAllPerfume(private val repository: IPerfumeDataSource) {
    suspend operator fun invoke() = repository.listAll()
}