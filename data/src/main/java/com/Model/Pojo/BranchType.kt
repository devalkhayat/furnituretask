package com.Model.Pojo

import com.google.gson.annotations.SerializedName

data class BranchType(

    @SerializedName("id")
    val id:Int,
    @SerializedName("branch_type_id")
    val branchTypeID:Int,
    @SerializedName("image")
    val image:String,
    @SerializedName("name")
  val name:String,
    @SerializedName("count")
    val count:Int


)
