package com.Model.Pojo
import com.google.gson.annotations.SerializedName


data class Category(
    @SerializedName("id")
    val id:Int,
    @SerializedName("category_id")
    val categoryID:Int,
    @SerializedName("code")
    val code:String,
    @SerializedName("image")
    val image:String,
    @SerializedName("name")
    val name:String,
    @SerializedName("count")
    val count:String)
