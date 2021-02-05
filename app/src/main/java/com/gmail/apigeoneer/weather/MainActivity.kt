package com.gmail.apigeoneer.weather

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvWeather: RecyclerView
    private lateinit var etCity: EditText
    private lateinit var btnCityById: Button
    private lateinit var btnWeatherByCity: Button
    private lateinit var btnWeatherById: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWeather = findViewById(R.id.weather_rv)
        etCity = findViewById(R.id.city_et)
        btnCityById = findViewById(R.id.get_city_id_btn)
        btnWeatherByCity = findViewById(R.id.weather_by_city_btn)
        btnWeatherById = findViewById(R.id.weather_by_id_btn)

        btnCityById.setOnClickListener {
            Toast.makeText(this, "btnCityById clicked!", Toast.LENGTH_SHORT).show()
        }

        btnWeatherById.setOnClickListener {
            Toast.makeText(this, "btnWeatherById clicked!", Toast.LENGTH_SHORT).show()
        }

        btnWeatherByCity.setOnClickListener {
            Toast.makeText(this, "btnWeatherByCity", Toast.LENGTH_SHORT).show()
        }
    }
}