package com.example.apiretrofitdemo.data


import com.google.gson.annotations.SerializedName

data class CatalogContents(
    @SerializedName("active_children")
    val activeChildren: List<Any>,
    @SerializedName("category_banner")
    val categoryBanner: String,
    @SerializedName("category_logo")
    val categoryLogo: Any,
    @SerializedName("category_name")
    val categoryName: String,
    @SerializedName("category_publication_status")
    val categoryPublicationStatus: Int,
    @SerializedName("children_recursive")
    val childrenRecursive: List<Any>,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("created_by")
    val createdBy: Int,
    @SerializedName("depth")
    val depth: Any,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("lft")
    val lft: Any,
    @SerializedName("parent_id")
    val parentId: Int,
    @SerializedName("rgt")
    val rgt: Any,
    @SerializedName("slug_url")
    val slugUrl: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("updated_by")
    val updatedBy: Int
)