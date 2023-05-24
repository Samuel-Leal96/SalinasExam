package com.example.examplesalinas.domain

import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.model.StarWarsResponseModelItem
import com.example.examplesalinas.data.network.ApiRepository

class GetStarWarsUseCase {
    private val repository = ApiRepository()

    suspend operator fun invoke(): List<StarWarsResponseModelItem>? = repository.getStarWarsRepo()
}