package com.example.examplesalinas.domain

import com.example.examplesalinas.data.model.ResponseModel
import com.example.examplesalinas.data.network.ApiRepository

class GetApi {
    val iniciarServicio = StartService()
}

class StartService{
    val repository = ApiRepository()
    suspend operator fun invoke(): ResponseModel? = repository.repository()
}