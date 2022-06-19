package com.zasa.simpleyelpapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 **@Project -> SimpleYelpApp
 **@Author -> Sangeeth on 6/20/2022
 */
interface YelpService {

    @GET("businesses/search")
    fun searchRestaurants(
        @Header("Authorization") authHeader : String,
        @Query("term") searchTerm : String,
        @Query("location") location : String
    ) : Call<YelpData>
}