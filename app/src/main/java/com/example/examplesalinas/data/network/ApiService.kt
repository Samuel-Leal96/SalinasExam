package com.example.examplesalinas.data.network

import com.example.examplesalinas.core.RetrofilHelper
import com.example.examplesalinas.data.model.ResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiService {

    private val retrofitHelper = RetrofilHelper.retrofitObject()

    suspend fun getService():ResponseModel {
        return withContext(Dispatchers.IO){
            val response = retrofitHelper
                .create(Api::class.java)
                .getService()
            response
        }
    }

}