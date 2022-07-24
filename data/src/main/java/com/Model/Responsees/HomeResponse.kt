package com.Model.Responsees

import com.Model.Pojo.Data
import com.google.gson.annotations.SerializedName

data class HomeResponse(
    @SerializedName("data")
    val data: Data,
   @SerializedName("message")
    val message:String,
    @SerializedName("status")
    val status:Boolean
)
