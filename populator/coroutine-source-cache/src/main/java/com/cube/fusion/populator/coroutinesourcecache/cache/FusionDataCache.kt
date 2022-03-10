package com.cube.fusion.populator.coroutinesourcecache.cache

import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource

/**
 * Abstract class representing a cache where Fusion data can be asynchronously fetched from and stored using Kotlin Coroutines
 *
 * Created by JR Mitchell on 09/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param CachedType the type in which the data is cached
 */
abstract class FusionDataCache<CachedType> : FusionDataSource<CachedType>() {

	/**
	 * Cache some Fusion data
	 *
	 * @param screenLink the link for the page
	 * @param data the data to store for this link
	 */
	abstract suspend fun cache(screenLink: String, data: CachedType)

	/**
	 * Retrieve a new [FusionDataCache] instance based on this one, with given data transformations
	 *
	 * @param transform the transformation to apply to every piece of data retrieved from this cache
	 * @param inverseTransform the transformation to apply to data before storing it in this cache
	 * @param [TransformedType] the type that data is transformed from before cacheing, and transformed to after retrieving from the cache
	 * @return a [FusionDataCache] instance that takes [TransformedType] data and applies the relevant transformation before cacheing / after retrieval
	 */
	fun <TransformedType> map(transform: (CachedType) -> TransformedType, inverseTransform: (TransformedType) -> CachedType): FusionDataSource<TransformedType> = object : FusionDataCache<TransformedType>() {
		override suspend fun cache(screenLink: String, data: TransformedType) = this@FusionDataCache.cache(screenLink, inverseTransform(data))
		override suspend fun retrieve(screenLink: String): Result<TransformedType> = this@FusionDataCache.retrieve(screenLink).map(transform)
	}
}