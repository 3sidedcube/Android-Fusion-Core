package com.cube.fusion.populator.coroutinesourcecache.cache

import com.cube.fusion.core.model.Page
import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource

/**
 * Interface representing a cache where Fusion [Page] data can be asynchronously fetched from and stored using Kotlin Coroutines
 *
 * Created by JR Mitchell on 09/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface FusionDataCache : FusionDataSource {

	/**
	 * Cache a [Page]'s data
	 *
	 * @param screenLink the link for the page
	 * @param page the page to store for this link
	 */
	suspend fun cache(screenLink: String, page: Page)
}