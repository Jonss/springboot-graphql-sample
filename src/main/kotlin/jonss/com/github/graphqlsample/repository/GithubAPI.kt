package jonss.com.github.graphqlsample.repository

import jonss.com.github.graphqlsample.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubAPI {

    @GET("/users/{userName}")
    fun findUser(@Path("userName") userName: String): Call<GithubUser?>

//    @GET("/users/{userName}/repos")
//    fun fetchRepos()

}