package com.android.testcomposeapp.data.datasource.api.model

import com.google.gson.annotations.SerializedName


data class Businesses(
    @SerializedName("rating") var rating: Float? = null,
    @SerializedName("price") var price: String? = null,
    @SerializedName("phone") var phone: String? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("alias") var alias: String? = null,
    @SerializedName("is_closed") var isClosed: Boolean? = null,
    @SerializedName("categories") var categories: ArrayList<Categories> = arrayListOf(),
    @SerializedName("review_count") var reviewCount: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("image_url") var imageUrl: String? = null,
    @SerializedName("location") var location: Location? = Location(),
    @SerializedName("distance") var distance: Double? = null,
    @SerializedName("transactions") var transactions: ArrayList<String> = arrayListOf()
){

    fun isClosed() = if(isClosed == true) "Open" else "Closed"
}