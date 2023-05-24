package com.example.examplesalinas.core

import com.example.examplesalinas.data.network.Api
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofilHelper {

    fun retrofitObjectPokemons(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constans.urlPokeApi)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }

    fun retrofitObjectStartWars(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constans.urlStarWars)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }

    fun retrofitObjectStartWars2(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constans.baseUrlStarWars)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }


}