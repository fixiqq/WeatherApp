package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
const val API_KEY = "a373df63af3948e6b7f95250222811"
class MainActivity : AppCompatActivity() {


    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bGet.setOnClickListener(){

        }
    }
    private fun getResult(name: String) {
        var url = "http://api.weatherapi.com/v1/current.json?" +
                "key=$API_KEY&q=London&aqi=no"
    }
}