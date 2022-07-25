package com.UI.Views.Authentication.Login

import android.util.Log
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

    val data= MutableLiveData<LoginResponse>()
    val loginRepository: LoginRepository = LoginRepository()

    fun checkCredentionals(userName:String,password:String){

       var rq: LoginRequest=LoginRequest(userName,password)

        loginRepository.login(rq)?.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if(response.isSuccessful) {
                    data.postValue(response.body())
                }else{
                    var errorResonse= LoginResponse(message = "error", status = false)
                    data.postValue(errorResonse)
                }
            }
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

              var errorResonse= LoginResponse(message = t.message.toString(), status = false)
               data.postValue(errorResonse)
            }
        })


    }
}