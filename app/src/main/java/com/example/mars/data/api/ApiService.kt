package com.example.mars.data.api

import com.example.mars.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("bank/currency") // input ip server
    suspend fun getNalMoneys(): Response<Nalichka>

}