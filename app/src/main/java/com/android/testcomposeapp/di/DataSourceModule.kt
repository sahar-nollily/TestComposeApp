package com.android.testcomposeapp.di

import com.android.testcomposeapp.data.datasource.api.BusinessesDataSource
import com.android.testcomposeapp.data.repository.BusinessesDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Singleton
    @Binds
    abstract fun bindAuthDataSource(businessesDataSourceImpl: BusinessesDataSourceImpl): BusinessesDataSource

}