package com.example.examplesalinas.data.network

import com.example.examplesalinas.core.Constans
import com.example.examplesalinas.data.model.PokeApiResponseModel
import com.example.examplesalinas.data.model.ResponseStarWars2Model
import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.model.StarWarsResponseModelItem
import retrofit2.http.GET

interface Api {
    @GET(Constans.endpointPokeApi)
    suspend fun servicePokemons(): PokeApiResponseModel

    @GET(Constans.endpointStarWars)
    suspend fun serviceStarWars(): List<StarWarsResponseModelItem>

    @GET(Constans.endpointStarWars2)
    suspend fun serviceStarWars2(): ResponseStarWars2Model
}