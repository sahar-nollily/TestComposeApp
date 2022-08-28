package com.android.testcomposeapp.di

import com.android.testcomposeapp.core.Constants.BASE_URL
import com.android.testcomposeapp.data.datasource.api.BusinessesApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit() =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    fun provideBusinessesApi(retrofit: Retrofit) = retrofit.create(BusinessesApi::class.java)

}