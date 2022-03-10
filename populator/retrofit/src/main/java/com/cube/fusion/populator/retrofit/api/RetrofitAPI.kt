package com.cube.fusion.populator.retrofit.api

import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofit API for the Retrofit populator
 *
 * Created by JR Mitchell on 10/March/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface RetrofitAPI {
	@GET("{url}")
	suspend fun getContentByLink(@Path("url") url: String): ResponseBody

	companion object {
		/**
		 * Gets an instance of the [RetrofitAPI] with the given base URL
		 * @param baseUrl the base URL
		 */
		fun getAPI(baseUrl: String): RetrofitAPI {
			val okHttpClient = OkHttpClient()
				.newBuilder()
				.build()
			return Retrofit.Builder()
				.client(okHttpClient)
				.baseUrl(baseUrl)
				.build()
				.create(RetrofitAPI::class.java)
		}
	}
}