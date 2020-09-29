package com.demo.rxjava_demo.server.response

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("data")
    val users: List<User>
)