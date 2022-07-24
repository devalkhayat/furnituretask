package com.Remote

import com.Model.Responsees.HomeResponse
import com.Model.Responsees.LoginResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface EndPoints {

    @GET("home")
    public fun getHome(): Call<HomeResponse>

    @Multipart
    @POST("login")
    public fun login(@Part("username") userName: RequestBody, @Part("password") password:RequestBody): Call<LoginResponse>


}