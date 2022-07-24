package com.UI.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.Category
import com.UI.Adapters.Holders.CategoryHolderItem
import com.example.task_furniture.databinding.ItemCategoryBinding

class CategoriesAdapter(): RecyclerView.Adapter<CategoryHolderItem>() {

    lateinit var items:List<Category>

  fun setItemsList(_items:List<Category>) {
      items = _items
  }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolderItem {
        val itemBinding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryHolderItem(itemBinding,parent.context)
    }

    override fun onBindViewHolder(holder: CategoryHolderItem, position: Int) {

        holder.bind(items.get(position))

    }

    override fun getItemCount(): Int {
       return items.size
    }
}