package com.aditya.beritaapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.beritaapi.databinding.ActivityDetailBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}