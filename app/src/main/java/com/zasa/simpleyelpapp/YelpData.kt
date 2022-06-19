package com.zasa.simpleyelpapp

import com.google.gson.annotations.SerializedName

/**
 **@Project -> SimpleYelpApp
 **@Author -> Sangeeth on 6/20/2022
 */
data class YelpData(
    @SerializedName("total") val total : Int,
    @SerializedName("businesses") val restaurants : List<YelpRestaurant>
)

data class YelpRestaurant(
    @SerializedName("name") val name : String
)
