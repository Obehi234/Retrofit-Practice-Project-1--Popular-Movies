package com.example.firstretrofitproject.endpoints


import com.example.firstretrofitproject.data.PopularMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface TmdbEndpoints {

    @GET("/3/movie/popular")
    fun getMovies(@Query("api_key") key: String): Call<PopularMovies>

}