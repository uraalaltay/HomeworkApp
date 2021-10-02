package com.example.retrofitexample.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NasaData(
    @SerialName("photos")
    val photos: List<Photo>
)