package com.example.retrofitexample

import android.telecom.Call
import retrofit2.http.GET


 interface ApiInterface {

    @GET("posts")
    fun getData(): retrofit2.Call<List<MyDataItem>>

}