package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("birthday")
    val birthday: String,
    @SerializedName("age")
    val age: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("user_id")
    val user_id: String,
    @SerializedName("token")
    val token: String
)
