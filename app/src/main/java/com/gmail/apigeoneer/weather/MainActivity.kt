package com.gmail.apigeoneer.weather

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray


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
            // Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(this)
            val url = "https://www.metaweather.com/api/location/search/?query=london"


            // Request a string response from the provided URL.
            val stringRequest = StringRequest(
                Request.Method.GET, url,
                Response.Listener<String> { response ->
                    Toast.makeText(this, response, Toast.LENGTH_LONG).show()
                },
                Response.ErrorListener {
                    Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
                }
            )
            // Add the request to the RequestQueue.
            queue.add(stringRequest)
        }

        btnWeatherById.setOnClickListener {
            Toast.makeText(this, "btnWeatherById clicked!", Toast.LENGTH_SHORT).show()
        }

        btnWeatherByCity.setOnClickListener {
            Toast.makeText(this, "btnWeatherByCity", Toast.LENGTH_SHORT).show()
        }
    }
}