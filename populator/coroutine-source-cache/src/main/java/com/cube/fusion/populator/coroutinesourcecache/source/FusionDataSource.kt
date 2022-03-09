package com.cube.fusion.populator.coroutinesourcecache.source

import com.cube.fusion.core.model.Page

/**
 * Interface representing a source where Fusion [Page] data can be asynchronously fetched from using Kotlin Coroutines
 *
 * Created by JR Mitchell on 09/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface FusionDataSource {

	/**
	 * Attempts to retrieve a [Page] of data from its screen link
	 *
	 * @param screenLink the link for the page
	 * @return the result of the retrieval attempt
	 */
	suspend fun retrieve(screenLink: String): Result<Page>
}