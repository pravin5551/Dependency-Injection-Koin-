package com.example.koindependancy

import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {


    @GET("users")
    fun getUser(): Call<List<GithubUser>>
}