package com.example.appfoodordertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
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

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = resources.getString(R.string.asianFood)


//        binding.buttonFragment.setOnClickListener {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.flDish, DishPage.newInstance())
//                .commit()
//        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tool_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.account -> {
                Toast.makeText(this, "Будет переход в личный кабинет", Toast.LENGTH_LONG).show()
            }
        }
        return true
    }

    private fun init() {
        binding.apply {
            foodRecycler.layoutManager = GridLayoutManager(this@AsianFood, 3)
            foodRecycler.adapter = adapter
        }
    }




}