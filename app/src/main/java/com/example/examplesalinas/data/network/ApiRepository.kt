package com.example.examplesalinas.data.network

import android.util.Log
import com.example.examplesalinas.data.model.ApiProvider
import com.example.examplesalinas.data.model.PokeApiResponseModel
import com.example.examplesalinas.data.model.ResponseStarWars2Model
import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.model.StarWarsResponseModelItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response

class ApiRepository {

    private val service = ApiService()

    suspend fun getPokemosRepo(): PokeApiResponseModel? {
            withContext(Dispatchers.IO){
                try {
                    val response = service.getPokemons()
                    ApiProvider.pokemonsProvider = response
                    Log.d("resRepository", response.toString())
                }catch (e: Exception){
                    (e as? HttpException)?.let {
                        Log.d("resNoticiasError", e.toString())
                    }
                    Log.d("resFailError", e.printStackTrace().toString())
                }
            }
        return ApiProvider.pokemonsProvider
    }

    suspend fun getStarWarsRepo(): List<StarWarsResponseModelItem>? {
        withContext(Dispatchers.IO){
            try {
                val response = service.getStarWarsCharacters()
                ApiProvider.starWarsProvider = response
                Log.d("resRepository", response.toString())
            }catch (e: Exception){
                (e as? HttpException)?.let {
                    Log.d("resNoticiasError", e.toString())
                }
                Log.d("resFailError", e.printStackTrace().toString())
            }
        }
        return ApiProvider.starWarsProvider
    }

    suspend fun getStarWars2Repo(): ResponseStarWars2Model? {
        withContext(Dispatchers.IO){
            try {
                val response = service.getStarWarsSWAPI()
                ApiProvider.starWarsSWAPIProvider = response
                Log.d("resRepository", response.toString())
            }catch (e: Exception){
                (e as? HttpException)?.let {
                    Log.d("resNoticiasError", e.toString())
                }
                Log.d("resFailError", e.printStackTrace().toString())
            }
        }
        return ApiProvider.starWarsSWAPIProvider
    }

}