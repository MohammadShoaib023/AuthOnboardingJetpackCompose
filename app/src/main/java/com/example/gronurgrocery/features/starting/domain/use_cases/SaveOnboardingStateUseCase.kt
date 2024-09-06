package com.example.gronurgrocery.features.starting.domain.use_cases

import com.example.gronurgrocery.common.domain.repository.DataStoreRepository
import javax.inject.Inject

class SaveOnboardingStateUseCase @Inject constructor(
    private val dataStoreRepository: DataStoreRepository
) {
    suspend operator fun invoke() {
        dataStoreRepository.saveOnboardingState(true)
    }
}