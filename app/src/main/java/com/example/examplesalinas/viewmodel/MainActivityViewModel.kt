package com.example.examplesalinas.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplesalinas.data.model.StarWarsResponseModel
import com.example.examplesalinas.data.network.Api
import com.example.examplesalinas.domain.GetStarWarsSWAPIUseCase
import com.example.examplesalinas.domain.GetStarWarsUseCase
import com.google.gson.GsonBuilder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivityViewModel: ViewModel() {

    val personajesModel = MutableLiveData<StarWarsResponseModel?>()

    var resultFlow = MutableStateFlow<Boolean?>(null)

    val getPersonajeUseCase = GetStarWarsSWAPIUseCase()

    fun startService(){
        viewModelScope.launch {
            val result = getPersonajeUseCase()

            Log.d("resultVM", result.toString() )
        }
    }
}