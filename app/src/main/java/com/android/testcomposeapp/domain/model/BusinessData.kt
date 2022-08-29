package com.android.testcomposeapp.domain.model

import com.android.testcomposeapp.data.datasource.api.model.Businesses

data class BusinessData(
    val name : String,
    val list : List<Businesses>,
)