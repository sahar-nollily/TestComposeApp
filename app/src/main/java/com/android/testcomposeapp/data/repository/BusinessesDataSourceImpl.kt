package com.android.testcomposeapp.data.repository

import com.android.testcomposeapp.core.BaseResponse
import com.android.testcomposeapp.core.Resource
import com.android.testcomposeapp.data.datasource.api.BusinessesApi
import com.android.testcomposeapp.data.datasource.api.BusinessesDataSource
import com.android.testcomposeapp.data.datasource.api.model.Categories
import com.android.testcomposeapp.data.datasource.api.model.CategoriesResponseContainer
import com.android.testcomposeapp.data.datasource.api.model.SearchResponseContainer
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BusinessesDataSourceImpl @Inject constructor(private val businessesApi: BusinessesApi) :
    BusinessesDataSource, BaseResponse() {

    override fun searchBusinesses(category: String?): Flow<Resource<SearchResponseContainer>> {
        return handleApiResponse { businessesApi.searchBusinesses() }
    }

    override fun getCategories(): Flow<Resource<CategoriesResponseContainer>> {
        return handleApiResponse { businessesApi.getCategories() }
    }


}