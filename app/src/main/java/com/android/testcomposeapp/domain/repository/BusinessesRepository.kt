package com.android.testcomposeapp.domain.repository

import com.android.testcomposeapp.data.datasource.api.BusinessesDataSource
import javax.inject.Inject

class BusinessesRepository @Inject constructor(private val businessesDataSource: BusinessesDataSource) {

    fun searchBusinesses(category: String? = null) = businessesDataSource.searchBusinesses(category)

    fun getCategories() = businessesDataSource.getCategories()
}
