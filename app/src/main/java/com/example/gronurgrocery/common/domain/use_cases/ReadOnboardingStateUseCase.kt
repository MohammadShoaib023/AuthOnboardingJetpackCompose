package com.example.gronurgrocery.common.domain.use_cases

import com.example.gronurgrocery.common.domain.repository.DataStoreRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadOnboardingStateUseCase @Inject constructor(
    private val repository: DataStoreRepository
) {
    operator fun invoke(): Flow<Boolean> {
        return repository.readOnboardingState()
    }
}