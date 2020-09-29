package com.demo.rxjava_demo.server

import com.demo.rxjava_demo.server.response.Data
import io.reactivex.Single
import javax.inject.Inject

class Service {

    @Inject
    lateinit var api: Api

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getUsers(): Single<Data> {
        return api.getUsers()
    }
}