package com.example.githubusernavapi.api

import com.example.githubusernavapi.data.model.DetailUserRes
import com.example.githubusernavapi.data.model.User
import com.example.githubusernavapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
//    @Headers(mySuperSecretKey)
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserRes>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username")username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username")username: String
    ): Call<ArrayList<User>>
}