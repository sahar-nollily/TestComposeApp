package com.android.testcomposeapp.data.datasource.api

import com.android.testcomposeapp.core.Resource
import com.android.testcomposeapp.data.datasource.api.model.Categories
import com.android.testcomposeapp.data.datasource.api.model.CategoriesResponseContainer
import com.android.testcomposeapp.data.datasource.api.model.SearchResponseContainer
import kotlinx.coroutines.flow.Flow

interface BusinessesDataSource {
    fun searchBusinesses(category: String? = null): Flow<Resource<SearchResponseContainer>>

    fun getCategories(): Flow<Resource<CategoriesResponseContainer>>
}