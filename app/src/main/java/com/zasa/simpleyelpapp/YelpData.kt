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

    val name : String,
    val rating : Double,
    val price : String,
    @SerializedName("review_count") val numReviews : Int,
    @SerializedName("distance") val distanceInMeters : Double,
    @SerializedName("image_url") val imageUrl : String

)
