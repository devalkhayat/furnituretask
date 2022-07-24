package com.UI.Adapters.Holders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.BranchType
import com.Model.Pojo.Category
import com.bumptech.glide.Glide
import com.example.task_furniture.R

import com.example.task_furniture.databinding.ItemBranchTypeBinding

class BranchTypeHolderItem (val binding: ItemBranchTypeBinding, val context: Context,val type: Int ): RecyclerView.ViewHolder(binding.root) {

    fun bind(branchType: BranchType){

        if(type ==1){
            binding.itemBranchTypeContainer.setBackgroundResource(R.drawable.box_round_red)

        }else{

            binding.itemBranchTypeContainer.setBackgroundResource(R.drawable.box_round_yellow)
        }
        binding.tvTitle.text=branchType.name
        Glide.with(context).load(branchType.image).into(binding.photo);

    }

}