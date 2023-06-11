package com.example.appfoodordertest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appfoodordertest.databinding.FoodItemBinding

class FoodAdapter: RecyclerView.Adapter<FoodAdapter.FoodHolder>() {
    val foodList = ArrayList<Food>()
    class FoodHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FoodItemBinding.bind(item)
        fun bind(food: Food) = with(binding) {
            imageFood.setImageResource(food.imageId)
            tvTitle.text= food.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return FoodHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        holder.bind(foodList[position])
    }

    fun addAllFood(list: List<Food>) {
        foodList.addAll(list)
        notifyDataSetChanged()
    }


}