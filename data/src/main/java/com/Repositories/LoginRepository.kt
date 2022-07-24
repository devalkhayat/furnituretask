package com.Repositories


import android.R.attr.password
import com.Model.Requests.LoginRequest
import com.Model.Responsees.LoginResponse
import com.Remote.Builder

import okhttp3.RequestBody
import retrofit2.Call
import okhttp3.MediaType;
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.ResponseBody.Companion.toResponseBody

class LoginRepository {

    fun login(request:LoginRequest): Call<LoginResponse>? {

        val emailOrUsernameBody: RequestBody = request.userName.toString().toRequestBody("text/plain;charset=utf-8".toMediaType())

        val passwordBody: RequestBody = request.password.toString().toRequestBody("text/plain;charset=utf-8".toMediaType())

        return Builder().getBindObject()?.login(emailOrUsernameBody,passwordBody)
    }
}