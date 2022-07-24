package com.UI.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.Discount
import com.UI.Adapters.Holders.DiscountHolderItem
import com.example.task_furniture.databinding.ItemDiscountsBinding

class DiscountsAdapter(): RecyclerView.Adapter<DiscountHolderItem>() {

    lateinit var items:List<Discount>

    fun setItemsList(_items:List<Discount>) {
        items = _items
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscountHolderItem {
        val itemBinding = ItemDiscountsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiscountHolderItem(itemBinding,parent.context)
    }

    override fun onBindViewHolder(holder: DiscountHolderItem, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }




}