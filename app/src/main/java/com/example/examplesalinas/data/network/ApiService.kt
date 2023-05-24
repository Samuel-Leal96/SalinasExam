package com.example.examplesalinas.data.network

import com.example.examplesalinas.core.RetrofilHelper
import com.example.examplesalinas.data.model.PokeApiResponseModel
import com.example.examplesalinas.data.model.ResponseStarWars2Model
import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.model.StarWarsResponseModelItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiService {

    private val retrofitStarWars = RetrofilHelper.retrofitObjectStartWars()
    private val retrofitPokemons = RetrofilHelper.retrofitObjectPokemons()
    private val retrofitStarWars2 = RetrofilHelper.retrofitObjectStartWars2()



    suspend fun getPokemons(): PokeApiResponseModel {
        return withContext(Dispatchers.IO){
            val response = retrofitPokemons
                .create(Api::class.java)
                .servicePokemons()
            response
        }
    }

    suspend fun getStarWarsCharacters(): List<StarWarsResponseModelItem> {
        return withContext(Dispatchers.IO){
            val response = retrofitStarWars
                .create(Api::class.java)
                .serviceStarWars()
            response
        }
    }

    suspend fun getStarWarsSWAPI(): ResponseStarWars2Model {
        return withContext(Dispatchers.IO){
            val response = retrofitStarWars2
                .create(Api::class.java)
                .serviceStarWars2()
            response
        }
    }

}