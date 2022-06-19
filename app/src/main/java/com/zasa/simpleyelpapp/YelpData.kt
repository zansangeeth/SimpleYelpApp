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
    @SerializedName("image_url") val imageUrl : String,
    val category : List<YelpCategory>,
    val yelpLocation: YelpLocation
){
    fun displayDistance() : String{
        val milesPerMeter = 0.000621371
        val distanceInMiles = "%.2f".format(distanceInMeters * milesPerMeter)
        return "$distanceInMiles mi"
    }
}

data class YelpCategory(
    val title : String
)

data class YelpLocation(
    @SerializedName("address1") val address : String
)
