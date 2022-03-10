package com.cube.fusion.populator.retrofit.source

import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.objectMapper
import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource
import com.cube.fusion.populator.retrofit.api.RetrofitAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * [FusionDataSource] implementation which fetches the data from an API endpoint using Retrofit
 *
 * Created by JR Mitchell on 10/March/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param DataType the expected parseable return type of the Retrofit API request
 * @param baseUrl the base URL of the API
 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
 * @param clazz the class to parse the API data to
 */
open class RetrofitDataSource<DataType>(val baseUrl: String, val resolvers: Collection<ViewResolver>, val clazz: Class<DataType>) : FusionDataSource<DataType>() {
	private fun api() = RetrofitAPI.getAPI(baseUrl)
	override suspend fun retrieve(screenLink: String): Result<DataType> = runCatching {
		return@runCatching withContext(Dispatchers.IO) {
			// Remove base URL from link if necessary
			val unqualifiedLink = screenLink.removePrefix(baseUrl)
			// Get content
			val stream = api().getContentByLink(unqualifiedLink).byteStream()
			resolvers.objectMapper().readValue(stream, clazz) ?: throw Throwable()
		}
	}
}