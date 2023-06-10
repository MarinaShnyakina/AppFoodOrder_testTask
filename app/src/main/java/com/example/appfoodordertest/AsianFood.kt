package com.example.appfoodordertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appfoodordertest.databinding.ActivityAsianBinding

class AsianFood : AppCompatActivity() {
    lateinit var binding: ActivityAsianBinding
    private val adapter = FoodAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsianBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            categoryRecycler.layoutManager = GridLayoutManager(this@AsianFood, 3)
            categoryRecycler.adapter = adapter
        }
    }
}