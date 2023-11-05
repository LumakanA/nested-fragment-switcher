package com.example.nested_fragment_switcher.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nested_fragment_switcher.R
import com.example.nested_fragment_switcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}