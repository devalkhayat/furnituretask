package com.UI.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.BranchType
import com.UI.Adapters.Holders.BranchTypeHolderItem
import com.example.task_furniture.databinding.ItemBranchTypeBinding

class BranchesTypesAdaper (): RecyclerView.Adapter<BranchTypeHolderItem>() {

    lateinit var items:List<BranchType>

    fun setItemsList(_items:List<BranchType>) {
        items = _items
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BranchTypeHolderItem {
        val itemBinding = ItemBranchTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BranchTypeHolderItem(itemBinding,parent.context,viewType)
    }

    override fun getItemViewType(position: Int): Int {

        if (position % 2 == 0)
          return 1
        else
            return 2

    }

    override fun onBindViewHolder(holder: BranchTypeHolderItem, position: Int) {
        holder.bind(items.get(position))
    }

    override fun getItemCount(): Int {
        return items.size
    }




}