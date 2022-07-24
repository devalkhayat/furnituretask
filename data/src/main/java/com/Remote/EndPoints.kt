package com.Remote

import com.Model.Responsees.HomeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface EndPoints {

@GET("home")
public fun getHome(): Call<HomeResponse>

}