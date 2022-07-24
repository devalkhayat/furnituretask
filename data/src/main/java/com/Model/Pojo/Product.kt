package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("product_id")
    val productID:Int,
    @SerializedName("quantity")
    val quantity:Int,
    @SerializedName("product")
    val product:String,
    @SerializedName("icon")
    val icon:String)
