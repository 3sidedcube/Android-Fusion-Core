package com.cube.fusion.populator.legacy.api

import com.google.gson.JsonElement
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofit API for the legacy populator
 *
 * Created by Nikos Rapousis on 22/September/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface API {
	@GET("{url}")
	fun getContentByLinkAsync(@Path("url") url: String): Deferred<Response<APIResponse<JsonElement>>>
}