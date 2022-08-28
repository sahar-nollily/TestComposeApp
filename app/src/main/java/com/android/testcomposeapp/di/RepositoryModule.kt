package com.android.testcomposeapp.di

import com.android.testcomposeapp.data.datasource.api.BusinessesDataSource
import com.android.testcomposeapp.domain.repository.BusinessesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideBusinessesRepository(businessesDataSource: BusinessesDataSource) = BusinessesRepository(businessesDataSource)

}