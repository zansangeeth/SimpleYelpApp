package com.zasa.simpleyelpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private const val BASE_URL = "https://api.yelp.com/v3/"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}