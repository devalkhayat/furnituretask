package com.Model.Responsees

import com.Model.Pojo.HomeData
import com.Model.Pojo.User
import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName("data")
                         val user: User?=null,
                         @SerializedName("message")
                         val message:String,
                         @SerializedName("status")
                         val status:Boolean)
