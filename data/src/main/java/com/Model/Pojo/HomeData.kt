package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class HomeData(
    @SerializedName("categories")
    val categories:List<Category>,
    @SerializedName("offers")
    val offers:List<Offer>,
    @SerializedName("saves")
    val saves:List<Save>,
    @SerializedName("discounts")
    val discounts:List<Discount>,
    @SerializedName("branch_type")
    val branchTypes:List<BranchType>,

)
