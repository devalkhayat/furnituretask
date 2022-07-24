package com.Model.Responsees

import com.Model.Pojo.HomeData
import com.google.gson.annotations.SerializedName

data class HomeResponse(
    @SerializedName("data")
    val homeData: HomeData,
    @SerializedName("message")
    val message:String,
    @SerializedName("status")
    val status:Boolean
)
