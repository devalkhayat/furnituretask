package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class Offer(

    @SerializedName("id")
                 val id:Int,
    @SerializedName("offer_id")
                 val offerID:Int,
    @SerializedName("name")
                 val name:String,
    @SerializedName("price")
                 val price:String,
    @SerializedName("video")
                 val video:String,
    @SerializedName("images")
                 val images:List<Image>,
    @SerializedName("furniture_id")
                val furniture_id:Int,
    @SerializedName("furniture_name")
                val furniture_name:String,
    @SerializedName("furniture_logo")
                val furniture_logo:String,
    @SerializedName("products")
                val products:List<Product>,
    @SerializedName("rate")
                val rate:Int,
    @SerializedName("rate_count")
                val rate_count:Int,
    @SerializedName("model_type")
                val modelType:String,
    @SerializedName("qty_cart")
                val QuantityCart:Int)
