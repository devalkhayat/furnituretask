package com.UI.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.Category
import com.Model.Pojo.Image
import com.UI.Adapters.Holders.CategoryHolderItem
import com.UI.Adapters.Holders.ImageHolderItem
import com.example.task_furniture.databinding.ItemImageViewBinding

class ImagesAdapter(): RecyclerView.Adapter<ImageHolderItem>() {

    lateinit var items:List<Image>

    fun setItemsList(_items:List<Image>) {
        items = _items
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolderItem {
        val itemBinding = ItemImageViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageHolderItem(itemBinding,parent.context)
    }

    override fun onBindViewHolder(holder: ImageHolderItem, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }


}