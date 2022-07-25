package com.UI.Views.Home.NavFragments.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.Model.Pojo.BranchType
import com.Model.Pojo.Category
import com.Model.Pojo.Discount
import com.UI.Adapters.BranchesTypesAdaper
import com.UI.Adapters.CategoriesAdapter
import com.UI.Adapters.DiscountsAdapter
import com.example.task_furniture.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var homeBinding: FragmentHomeBinding
    lateinit var categoriesAdapter: CategoriesAdapter
    lateinit var discountsAdapter: DiscountsAdapter
    lateinit var branchTypesAdapter: BranchesTypesAdaper

    val homeViewModel:HomeFragmentViewModel by lazy {
       ViewModelProvider(this).get(HomeFragmentViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeBinding=FragmentHomeBinding.inflate(inflater,container,false)
        homeViewModel.getData()
        observers()
        return homeBinding.root

    }

    fun observers(){

        homeViewModel.data.observe(viewLifecycleOwner, Observer{ it->

            showCategory(it.homeData.categories)
            //
            showDiscount(it.homeData.discounts)
            //
            showBranchTypes(it.homeData.branchTypes)


        } )
    }

    fun showCategory( items:List<Category>){

        categoriesAdapter=CategoriesAdapter()
        categoriesAdapter.setItemsList(items)
        homeBinding.includeHomeCategoriesSection.rvCategories.adapter=categoriesAdapter
        homeBinding.includeHomeCategoriesSection.rvCategories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

    fun showDiscount(items:List<Discount>){

        discountsAdapter= DiscountsAdapter()
        discountsAdapter.setItemsList(items)
        homeBinding.includeHomeDiscountsSection.rvDiscounts.adapter=discountsAdapter
        homeBinding.includeHomeDiscountsSection.rvDiscounts.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

    fun showBranchTypes(items:List<BranchType>){

        branchTypesAdapter= BranchesTypesAdaper()
        branchTypesAdapter.setItemsList(items)
        homeBinding.includeHomeBranchTypesSection.rvBranchesTypes.adapter=branchTypesAdapter
        homeBinding.includeHomeBranchTypesSection.rvBranchesTypes.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

    }

}