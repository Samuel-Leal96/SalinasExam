package com.example.examplesalinas.data.network

import android.util.Log
import com.example.examplesalinas.data.model.ApiProvider
import com.example.examplesalinas.data.model.ResponseModel
import retrofit2.HttpException

class ApiRepository {

    private val service = ApiService()

    suspend fun repository(): ResponseModel? {
            try {
                val response = service.getService()
                Log.d("result", response.toString())
                ApiProvider.responseService = response
            } catch (e: Exception) {
                (e as? HttpException)?.let {
                    Log.e("exepcionLoginElse", it.toString())
                }
            }
            return ApiProvider.responseService
    }
}