package com.UI.Adapters.Holders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.Category
import com.bumptech.glide.Glide
import com.example.task_furniture.databinding.ItemCategoryBinding

class CategoryHolderItem(val binding: ItemCategoryBinding,val context:Context): RecyclerView.ViewHolder(binding.root) {

    fun bind(category:Category){

        binding.tvTitle.text=category.name

        Glide.with(context).load(category.image).into(binding.icon);

    }

}