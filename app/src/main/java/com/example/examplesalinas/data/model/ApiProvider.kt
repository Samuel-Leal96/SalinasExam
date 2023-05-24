package com.example.examplesalinas.data.model

import retrofit2.Call
import retrofit2.Response

class ApiProvider {

    companion object{
        var pokemonsProvider: PokeApiResponseModel? = null

        var starWarsProvider: List<StarWarsResponseModelItem>?=null

        var starWarsSWAPIProvider: ResponseStarWars2Model?=null


    }
}