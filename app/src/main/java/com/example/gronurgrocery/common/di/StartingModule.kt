package com.example.gronurgrocery.common.di

import android.content.Context
import com.example.gronurgrocery.common.data.repository.DataStoreRepositoryImpl
import com.example.gronurgrocery.common.domain.repository.DataStoreRepository
import com.example.gronurgrocery.features.starting.domain.use_cases.SaveOnboardingStateUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object StartingModule {

    @Provides
    @Singleton
    fun provideDataStoreRepository(@ApplicationContext context: Context): DataStoreRepository {
        return DataStoreRepositoryImpl(context)
    }

    @Provides
    @Singleton
    fun provideSaveOnboardingStateUseCase(repository: DataStoreRepository): SaveOnboardingStateUseCase {
        return SaveOnboardingStateUseCase(repository)
    }
}