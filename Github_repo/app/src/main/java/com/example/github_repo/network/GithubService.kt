package com.example.github_repo.network

import retrofit2.Call
import com.example.github_repo.model.Repo
import com.example.github_repo.model.UserDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {
    @Headers("Authorization: Bearer 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")

    @GET("users/{username}/repos")
    fun listRepos(@Path("username") username: String): Call<List<Repo>>

    @GET("search/users")
    fun searchUsers(@Query("q") query: String): Call<UserDto>

}