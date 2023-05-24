package com.example.examplesalinas.domain

import com.example.examplesalinas.data.model.ResponseStarWars2Model
import com.example.examplesalinas.data.network.ApiRepository

class GetStarWarsSWAPIUseCase {
    private val repository = ApiRepository()

    suspend operator fun invoke(): ResponseStarWars2Model? = repository.getStarWars2Repo()
}