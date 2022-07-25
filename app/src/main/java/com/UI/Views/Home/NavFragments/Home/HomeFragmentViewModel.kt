package com.UI.Views.Home.NavFragments.Home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.Model.Pojo.Category
import com.Model.Responsees.HomeResponse
import com.Remote.Builder
import com.Repositories.HomeRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragmentViewModel:ViewModel() {

    val data=MutableLiveData<HomeResponse>()
    val homeRepository:HomeRepository=HomeRepository()

    fun getData(){
        homeRepository.getHomeInfo()?.enqueue(object : Callback<HomeResponse> {
            override fun onResponse(call: Call<HomeResponse>, response: Response<HomeResponse>) {
                if(response.isSuccessful) {
                    data.postValue(response.body())
                }
            }
            override fun onFailure(call: Call<HomeResponse>, t: Throwable) {

            }
        })


    }
}