package com.gmail.apigeoneer.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCityById: Button
    private lateinit var btnWeatherByCity: Button
    private lateinit var btnWeatherById: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCityById = findViewById(R.id.get_city_id_btn)
        btnWeatherByCity = findViewById(R.id.weather_by_city_btn)
        btnWeatherById = findViewById(R.id.weather_by_id_btn)

        
    }
}