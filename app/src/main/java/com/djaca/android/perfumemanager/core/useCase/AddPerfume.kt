package com.djaca.android.perfumemanager.core.useCase

import com.djaca.android.perfumemanager.core.data.Perfume
import com.djaca.android.perfumemanager.core.repository.IPerfumeDataSource

class AddPerfume(private val repository: IPerfumeDataSource) {
    suspend operator fun invoke(perfume: Perfume) = repository.add(perfume)
}