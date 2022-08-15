package com.dias.drawabletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dias.drawabletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    private var batteryLevel = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            plusBtn.setOnClickListener {
                batteryLevel = if(++batteryLevel in 0..7) batteryLevel else 7
                batteryImg.setImageLevel(batteryLevel)
            }
            minusBtn.setOnClickListener {
                batteryLevel = if(--batteryLevel in 0..7) batteryLevel else 0
                batteryImg.setImageLevel(batteryLevel)
            }
        }
    }
}