package com.example.examplesalinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.examplesalinas.data.network.Api
import com.example.examplesalinas.databinding.ActivityMainBinding
import com.example.examplesalinas.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainActivityViewModel: MainActivityViewModel

    private lateinit var apiService: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityViewModel=
            ViewModelProvider(this)[MainActivityViewModel::class.java]

        val btnStart = binding.btnStart

        btnStart.setOnClickListener {
            conectService()
        }

    }

    private fun conectService() {
        mainActivityViewModel.startService()
    }

    fun createPetition(){
        
    }

}