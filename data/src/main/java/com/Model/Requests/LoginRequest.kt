package com.Model.Requests

import com.Model.Pojo.HomeData
import com.google.gson.annotations.SerializedName

data class LoginRequest(

    val userName: String,
    val password: String
)
