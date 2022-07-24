package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class Discount (
    @SerializedName("id")
    val id:Int,
    @SerializedName("discount_id")
    val discountID:Int,
    @SerializedName("price_before")
    val priceBefore:Int,
    @SerializedName("price_after")
    val priceAfter:Int,
    @SerializedName("percent")
    val percent:Int,
    @SerializedName("product_name")
    val productName:String,
    @SerializedName("product_description")
    val productDescription:String,
    @SerializedName("images")
    val images:List<Image>,
    @SerializedName("furniture_id")
    val furnitureID:Int,
    @SerializedName("furniture_name")
    val furnitureName:String,
    @SerializedName("furniture_logo")
    val furnitureLogo:String,
    @SerializedName("rate")
    val rate:Int,
    @SerializedName("rate_count")
    val rateCount:Int,
    @SerializedName("model_type")
    val modelType:String,
    @SerializedName("qty_cart")
    val QuantityCart:String
)