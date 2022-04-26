package com.cube.fusion.populator.coroutinesourcecache.source

import android.content.Context
import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.objectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.InputStream
import java.lang.ref.WeakReference

/**
 * [FusionDataSource] implementation that retrieves [Page]s from the app's assets
 * Note that this keeps a [WeakReference] to the context, and so where possible, [updateContext] should be called before attempting to read or write
 *
 * Created by JR Mitchell on 18/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param context the context to initialise this cache from
 * @param screenNameTransform a transformation to apply to the screen link to turn it into the cache file name
 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
 */
class AssetsPageSource(context: Context, screenNameTransform: (String) -> String, val resolvers: Collection<ViewResolver>) : AssetsDataSource<Page>(context, screenNameTransform) {
	override suspend fun readStream(stream: InputStream): Page {
		return withContext(Dispatchers.IO) {
			resolvers.objectMapper().readValue(stream, Page::class.java)
		}
	}
}