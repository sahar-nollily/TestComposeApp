package com.android.testcomposeapp.data.datasource.api.model

import com.google.gson.annotations.SerializedName

data class CategoriesResponseContainer(
    @SerializedName("categories") var categories: ArrayList<Categories> = arrayListOf()
)
