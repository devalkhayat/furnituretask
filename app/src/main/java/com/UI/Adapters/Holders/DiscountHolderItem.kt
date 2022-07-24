package com.UI.Adapters.Holders

import android.content.Context
import android.graphics.Paint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task_furniture.databinding.ItemDiscountsBinding
import com.bumptech.glide.Glide
import com.Model.Pojo.Discount
import com.UI.Adapters.DiscountsAdapter
import com.UI.Adapters.ImagesAdapter


class DiscountHolderItem (val binding: ItemDiscountsBinding,val context: Context): RecyclerView.ViewHolder(binding.root) {

    fun bind(discount: Discount){

        binding.tvTitle.text=discount.productName
        binding.tvDescription.text=discount.productDescription

        Glide.with(context).load(discount.furnitureLogo).into(binding.logo);
        binding.tvBranchName.text=discount.furnitureName

        binding.tvPercentage.text="${discount.percent.toString()} %"
        binding.tvOldPrice.text="${discount.priceBefore} جنيه"
        binding.tvCurrentPrice.text="${discount.priceAfter} جنيه"

        binding.tvOldPrice.paintFlags= Paint.STRIKE_THRU_TEXT_FLAG

         var imagesAdapter: ImagesAdapter
        imagesAdapter= ImagesAdapter()
        imagesAdapter.items=discount.images
        binding.rvImages.adapter=imagesAdapter
        binding.rvImages.layoutManager=
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)

    }
}