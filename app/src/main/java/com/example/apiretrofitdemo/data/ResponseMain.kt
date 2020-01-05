package com.example.apiretrofitdemo.data


import com.google.gson.annotations.SerializedName

data class ResponseMain(
    @SerializedName("catalog_contents")
    val catalogContents: CatalogContents,
    @SerializedName("catalog_products")
    val catalogProducts: List<CatalogProduct>,
    @SerializedName("status")
    val status: Boolean,
    @SerializedName("subCategories")
    val subCategories: List<Any>
)