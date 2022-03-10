package com.cube.fusion.populator.coroutinesourcecache.cache

import android.util.LruCache

/**
 * [FusionDataCache] implementation utilising Android [LruCache] to store pages in memory with a maximum size
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param cache the LruCache to store Fusion data in
 * @param CachedType the type in which the data is stored
 */
class LruDataCache<CachedType>(val cache: LruCache<String, CachedType>) : FusionDataCache<CachedType>() {
	constructor(maxSize: Int): this(LruCache(maxSize))
	override suspend fun cache(screenLink: String, data: CachedType) {
		cache.put(screenLink, data)
	}
	override suspend fun retrieve(screenLink: String): Result<CachedType> = cache[screenLink]?.let {
		Result.success(it)
	} ?: Result.failure(NoSuchElementException())
}