package com.example.gronurgrocery.common.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {
    suspend fun saveOnboardingState(completed: Boolean)

    fun readOnboardingState(): Flow<Boolean>
}