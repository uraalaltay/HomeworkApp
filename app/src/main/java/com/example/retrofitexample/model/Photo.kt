package com.example.retrofitexample.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Photo(
    @SerialName("camera")
    val camera: Camera,
    @SerialName("earth_date")
    val earthDate: String,
    @SerialName("id")
    val id: Int,
    @SerialName("img_src")
    val imgSrc: String,
    @SerialName("rover")
    val rover: Rover,
    @SerialName("sol")
    val sol: Int
)