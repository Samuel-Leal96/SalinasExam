package com.example.examplesalinas.data.network

import com.example.examplesalinas.core.Constans
import com.example.examplesalinas.data.model.ResponseModel
import retrofit2.http.Body
import retrofit2.http.GET

interface Api {
    @GET(Constans.endpointFinal)
    suspend fun getService(): ResponseModel
}