package com.demo.rxjava_demo.server

import com.demo.rxjava_demo.Activity.MainActivityViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: Service)

    fun inject(viewModel: MainActivityViewModel)
}