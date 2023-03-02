package com.example.github_repo.network

import retrofit2.Call
import com.example.github_repo.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {
    @GET("users/{username}/repos")
    fun listRepos(@Path("username") username: String): Call<List<Repo>>

    @GET("search/users")
    fun searchUsers(@Query("q") query: String): Call<>

}