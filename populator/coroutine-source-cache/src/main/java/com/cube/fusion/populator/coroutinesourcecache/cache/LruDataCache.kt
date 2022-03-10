package com.cube.fusion.populator.coroutinesourcecache.cache

import android.util.LruCache
import com.cube.fusion.core.model.Page

/**
 * [FusionDataCache] implementation utilising Android [LruCache] to store pages in memory with a maximum size
 * TODO: implement an [LruCache] that accurately approximates the size of a page in bytes
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param cache the LruCache to store page data in
 */
class LruDataCache(val cache: LruCache<String, Page>) : FusionDataCache {
	constructor(maxSize: Int): this(LruCache(maxSize))
	override suspend fun cache(screenLink: String, page: Page) {
		cache.put(screenLink, page)
	}
	override suspend fun retrieve(screenLink: String): Result<Page> = cache[screenLink]?.let {
		Result.success(it)
	} ?: Result.failure(NoSuchElementException())
}