package com.example.retrofitexample.service

import com.example.retrofitexample.model.Camera
import retrofit2.http.GET

interface IApiHttpMars{
    @GET("api/v1/rovers/curiosity/photos")
    suspend fun getHttpMarsList(): List<Camera>



}