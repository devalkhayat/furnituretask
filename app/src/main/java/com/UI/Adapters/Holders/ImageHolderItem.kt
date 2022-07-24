package com.UI.Adapters.Holders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.Category
import com.Model.Pojo.Image
import com.bumptech.glide.Glide
import com.example.task_furniture.databinding.ItemImageViewBinding

class ImageHolderItem (val binding: ItemImageViewBinding,val context: Context): RecyclerView.ViewHolder(binding.root) {

    fun bind(image: Image){


        Glide.with(context).load(image.path).into(binding.photo);

    }

}