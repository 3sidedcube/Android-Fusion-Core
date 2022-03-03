package com.cube.fusion.populator.legacy.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Singleton object for building the Retrofit API for the legacy populator
 *
 * Created by Nikos Rapousis on 22/September/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object APIFactory {
	var url: String = ""
	fun getAPI(): API {
		val okHttpClient = OkHttpClient()
			.newBuilder()
			.build()
		return Retrofit.Builder()
			.client(okHttpClient)
			.baseUrl(url)
			.addConverterFactory(GsonConverterFactory.create())
			.addCallAdapterFactory(CoroutineCallAdapterFactory())
			.build()
			.create(API::class.java)
	}
}