package com.example.examplesalinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.examplesalinas.core.RetrofilHelper
import com.example.examplesalinas.data.model.ApiProvider
import com.example.examplesalinas.data.model.ResponseModel
import com.example.examplesalinas.data.network.Api
import com.example.examplesalinas.databinding.ActivityMainBinding
import com.example.examplesalinas.viewmodel.MainActivityViewModel
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityViewModel=
            ViewModelProvider(this)[MainActivityViewModel::class.java]

        val btnStart = binding.btnStart

        btnStart.setOnClickListener {
            mainActivityViewModel.startService()
        }

    }

}