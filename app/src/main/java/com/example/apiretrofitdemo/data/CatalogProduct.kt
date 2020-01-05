package com.example.apiretrofitdemo.data


import com.google.gson.annotations.SerializedName

data class CatalogProduct(
    @SerializedName("batch_no")
    val batchNo: Int,
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("commission")
    val commission: Any,
    @SerializedName("commission_type")
    val commissionType: Any,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("created_by")
    val createdBy: Int,
    @SerializedName("discount")
    val discount: Int,
    @SerializedName("emi")
    val emi: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("gift_voucher")
    val giftVoucher: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: List<String>,
    @SerializedName("is_feature_product")
    val isFeatureProduct: Int,
    @SerializedName("max_in_cart")
    val maxInCart: Int,
    @SerializedName("new_arrival")
    val newArrival: Int,
    @SerializedName("outlet_id")
    val outletId: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("product_desc")
    val productDesc: String,
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("product_image")
    val productImage: String,
    @SerializedName("product_model")
    val productModel: String,
    @SerializedName("product_name")
    val productName: String,
    @SerializedName("product_publication_status")
    val productPublicationStatus: String,
    @SerializedName("specification")
    val specification: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("stock")
    val stock: Int,
    @SerializedName("stock_qty")
    val stockQty: Int,
    @SerializedName("tag")
    val tag: String,
    @SerializedName("tax_class_id")
    val taxClassId: Int,
    @SerializedName("tax_rate")
    val taxRate: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("updated_by")
    val updatedBy: Int,
    @SerializedName("vendor_id")
    val vendorId: Any,
    @SerializedName("warranty")
    val warranty: String,
    @SerializedName("weight")
    val weight: String,
    @SerializedName("weight_class")
    val weightClass: String,
    @SerializedName("weight_class_id")
    val weightClassId: Int
)