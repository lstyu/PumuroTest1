package com.example.pumurotest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pumurotest1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}