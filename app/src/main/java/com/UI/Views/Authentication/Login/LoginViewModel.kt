package com.UI.Views.Authentication.Login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.Model.Requests.LoginRequest
import com.Model.Responsees.HomeResponse
import com.Model.Responsees.LoginResponse
import com.Repositories.LoginRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel:ViewModel() {

    var data= MutableLiveData<LoginResponse>()
    val loginRepository: LoginRepository = LoginRepository()

    fun checkCredentionals(userName:String,password:String){

       var rq: LoginRequest=LoginRequest(userName,password)

        loginRepository.login(rq)?.enqueue(object : Callback<LoginResponse> {

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {

                if(response.isSuccessful) {
                    data.postValue(response.body())
                }

            }
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

            }
        })


    }
}