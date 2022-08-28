package com.android.testcomposeapp.data.datasource.api

import com.android.testcomposeapp.core.Constants.RESTAURANT_API_KEY
import com.android.testcomposeapp.data.datasource.api.model.Categories
import com.android.testcomposeapp.data.datasource.api.model.CategoriesResponseContainer
import com.android.testcomposeapp.data.datasource.api.model.SearchResponseContainer
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface BusinessesApi {

    @GET("businesses/search")
    suspend fun searchBusinesses(
        @Query("latitude") latitude: String = "0.0",
        @Query("longitude") longitude: String = "0.0",
        @Query("categories") category: String? = null,
        @Header("Authorization") authorization: String = "Bearer $RESTAURANT_API_KEY"
    ): Response<SearchResponseContainer>

    @GET("categories")
    suspend fun getCategories(
        @Query("locale") locale: String = "cs_CZ" ,
        @Header("Authorization") authorization: String = "Bearer $RESTAURANT_API_KEY"
    ): Response<CategoriesResponseContainer>

}