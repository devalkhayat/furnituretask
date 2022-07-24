package com.Repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.Model.Pojo.Category
import com.Model.Responsees.HomeResponse
import com.Remote.Builder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeRepository {


    fun getHomeInfo():Call<HomeResponse>? {
   //Bearer 498|6vO5MKUaeDcldosgzkfE621DsPUwIOjnBzMzkzOi
     return Builder().getBindObject()?.getHome()
    }

}