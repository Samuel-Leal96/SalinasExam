package com.example.examplesalinas.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplesalinas.data.model.ResponseModel
import com.example.examplesalinas.domain.GetApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {

    val response = MutableLiveData<ResponseModel?>()

    var resultFlow = MutableStateFlow<Boolean?>(null)

    val responseRepository = GetApi().iniciarServicio

    fun startService(){
        viewModelScope.launch {
            val result = responseRepository()

            if (result != null){
                response.value = result
                resultFlow.value = true
            }else{
                resultFlow.value = false
            }
        }
    }
}