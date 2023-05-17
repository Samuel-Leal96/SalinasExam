package com.example.examplesalinas.core

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofilHelper {

    private fun clientTimeOut(): OkHttpClient {

        return OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    fun retrofitObject(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constans.url)
            .addConverterFactory(GsonConverterFactory.create())
            .client(clientTimeOut())
            .build()
    }
}