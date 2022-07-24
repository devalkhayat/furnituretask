package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class Save(
 @SerializedName("id")
 val id :Int,
 @SerializedName("save_id")
val saveID :Int,
@SerializedName("name")
val name:String,
@SerializedName("price")
val price:Int,
@SerializedName("video")
val video:String,
@SerializedName("start")
 val startDate:String,
@SerializedName("end")
 val endDate :String,
@SerializedName("diff_day")
val diff_day: Int,
@SerializedName("from")
val fromTime:String,
@SerializedName("to")
val toTime: String,
@SerializedName("hours")
 val hours: Int,
@SerializedName("minutes")
val minutes:Int,
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
 val model_type:String,
 @SerializedName("qty_cart")
 val QuantityCart:Int,
)
