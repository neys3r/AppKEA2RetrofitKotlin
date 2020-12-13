package com.agricolalaventa.appkea2retrofitkotlin.api

import com.agricolalaventa.appkea2retrofitkotlin.model.Album
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceAlbum {
    @GET("albums")
    fun getAllPosts(): Call<List<Album>>
}