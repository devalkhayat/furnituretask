package com.UI.Views.Home.NavFragments.Home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Model.Pojo.BranchType
import com.Model.Pojo.Category
import com.Model.Pojo.Discount
import com.UI.Adapters.BranchesTypesAdaper
import com.UI.Adapters.CategoriesAdapter
import com.UI.Adapters.DiscountsAdapter
import com.example.task_furniture.R
import com.example.task_furniture.databinding.FragmentHomeBinding
import com.example.task_furniture.databinding.IncludeHomeCategoriesBinding

class HomeFragment : Fragment() {

    val homeViewModel:HomeFragmentViewModel by lazy {
       ViewModelProvider(this).get(HomeFragmentViewModel::class.java)
    }
    lateinit var homeBinding: FragmentHomeBinding
    lateinit var categoriesAdapter: CategoriesAdapter
    lateinit var discountsAdapter: DiscountsAdapter
    lateinit var branchTypesAdapter: BranchesTypesAdaper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeBinding=FragmentHomeBinding.inflate(inflater,container,false)

        homeViewModel.getData()
        homeViewModel.data.observe(viewLifecycleOwner, Observer{ it->

            showCategory(it.data.categories)
            //
            showDiscount(it.data.discounts)
            //
            showBranchTypes(it.data.branchTypes)


        } )

        return homeBinding.root

    }

    fun showCategory( items:List<Category>){

        categoriesAdapter=CategoriesAdapter()
        categoriesAdapter.items=items
        homeBinding.includeHomeCategoriesSection.rvCategories.adapter=categoriesAdapter
        homeBinding.includeHomeCategoriesSection.rvCategories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

    fun showDiscount(items:List<Discount>){

        discountsAdapter= DiscountsAdapter()
        discountsAdapter.items=items
        homeBinding.includeHomeDiscountsSection.rvDiscounts.adapter=discountsAdapter
        homeBinding.includeHomeDiscountsSection.rvDiscounts.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

    fun showBranchTypes(items:List<BranchType>){

        branchTypesAdapter= BranchesTypesAdaper()
        branchTypesAdapter.items=items
        homeBinding.includeHomeBranchTypesSection.rvBranchesTypes.adapter=branchTypesAdapter
        homeBinding.includeHomeBranchTypesSection.rvBranchesTypes.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

}