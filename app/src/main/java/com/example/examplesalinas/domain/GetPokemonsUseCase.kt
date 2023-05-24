package com.example.examplesalinas.domain

import com.example.examplesalinas.data.model.PokeApiResponseModel
import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.network.ApiRepository

class GetPokemonsUseCase {
    private val repository = ApiRepository()
    suspend operator fun invoke(): PokeApiResponseModel? = repository.getPokemosRepo()
}