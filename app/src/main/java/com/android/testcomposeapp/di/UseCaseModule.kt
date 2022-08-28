package com.android.testcomposeapp.di

import com.android.testcomposeapp.domain.repository.BusinessesRepository
import com.android.testcomposeapp.domain.usecase.GetBusinesses
import com.android.testcomposeapp.domain.usecase.GetCategories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetBusinesses(businessesRepository: BusinessesRepository) = GetBusinesses(businessesRepository)

    @Provides
    @Singleton
    fun provideGetCategories(businessesRepository: BusinessesRepository) = GetCategories(businessesRepository)

}