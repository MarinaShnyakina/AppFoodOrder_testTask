package com.example.appfoodordertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appfoodordertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openPageSoups()
        openPageAsian()
        openPageBakes()
        openPageFastfood()
        switchLowelMenu()
    }

    fun openPageSoups() {
        binding.imageSoups.setOnClickListener {
            startActivity(Intent(this, Soups::class.java))
        }
    }

    fun openPageAsian() {
        binding.imageAsian.setOnClickListener {
            startActivity(Intent(this, AsianFood::class.java))

        }
    }

    fun openPageFastfood() {
        binding.imageFastfood.setOnClickListener {
           startActivity(Intent(this, FastFood::class.java))

        }
    }

    fun openPageBakes() {
        binding.imageBakes.setOnClickListener {
            startActivity(Intent(this, Bakes::class.java))

        }
    }

    fun switchLowelMenu() {
        binding.bottomMenu.selectedItemId = R.id.tabMain
        binding.bottomMenu.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.tabMain -> {
                    Toast.makeText(this, "Должен открыться главный экран", Toast.LENGTH_LONG).show()
                }
                R.id.tabSearch -> {
                    Toast.makeText(this, "Должен открыться поиск", Toast.LENGTH_LONG).show()
                }
                R.id.tabBasket -> {
                    Toast.makeText(this, "Должна открыться корзина", Toast.LENGTH_LONG).show()
                }
                R.id.tabAccount -> {
                    Toast.makeText(this, "Должен открыться личный кабинет", Toast.LENGTH_LONG).show()
                }
            }
            true
        }
    }


}