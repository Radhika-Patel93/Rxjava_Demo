package com.demo.rxjava_demo.server

import com.demo.rxjava_demo.server.response.Data
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface Api {

    companion object {
        const val BASE_URL = "https://reqres.in/api/"
    }

    @GET("users")
    fun getUsers(): Single<Data>
}
