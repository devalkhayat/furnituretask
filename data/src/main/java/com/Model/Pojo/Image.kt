package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("id")
    val id:String,
    @SerializedName("path_id")
    val pathID:Int,
    @SerializedName("path")
    val path:String)
