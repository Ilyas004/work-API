package com.example.mars.data.repository

import com.example.mars.data.api.RetrofitInstance
import com.example.mars.model.beznal.BezNalOverflow
import com.example.mars.model.beznal.Beznal
import com.example.mars.model.beznal.BeznalItem
import com.example.mars.model.nal.Nalichka
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka> {
        return RetrofitInstance.api.getNalMoneys()
    }

    fun getBezNal(): Beznal {
        return BezNalOverflow.listBeznalItem as Beznal
    }
}