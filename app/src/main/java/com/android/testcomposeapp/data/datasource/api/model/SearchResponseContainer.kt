package com.android.testcomposeapp.data.datasource.api.model

import com.google.gson.annotations.SerializedName

data class SearchResponseContainer(
    @SerializedName("businesses" ) var businesses : List<Businesses> = arrayListOf(),
    @SerializedName("total"      ) var total      : Int?                  = null,
    @SerializedName("region"     ) var region     : Region?               = null
)