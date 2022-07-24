package com.Remote

import android.content.Context
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class Builder {

   // var mContext: Context? = null
    val BASE_URL = "https://backend.forhomi.com/api/"
    var retrofit: Retrofit? = null


    fun start(): Retrofit? {
        if (retrofit == null) {
            val logging = HttpLoggingInterceptor()
            // set your desired log level
            logging.level = HttpLoggingInterceptor.Level.BODY


            val okHttpClient = OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .addInterceptor { chain ->
                    val request = chain.request()
                    chain.proceed(request)
                }
                .build()
            retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build()
        }
        return retrofit
    }

    fun getBindObject(): EndPoints? {
       // mContext = context

        return start()?.create(EndPoints::class.java)
    }


    companion object{


    }
}