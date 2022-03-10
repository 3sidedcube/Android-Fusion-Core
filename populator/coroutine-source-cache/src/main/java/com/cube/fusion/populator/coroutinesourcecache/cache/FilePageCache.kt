package com.cube.fusion.populator.coroutinesourcecache.cache

import android.content.Context
import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.objectMapper
import java.io.File
import java.lang.ref.WeakReference

/**
 * [FusionDataCache] implementation to store Fusion [Page] data as JSON files
 * Note that this keeps a [WeakReference] to the context, and so where possible, [updateContext] should be called before attempting to read or write
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param context the context to initialise this cache from
 */
open class FilePageCache(context: Context, suffix: String, val resolvers: Collection<ViewResolver>) : FileDataCache<Page>(context, suffix) {
	override fun writeToFile(file: File, data: Page) = resolvers.objectMapper().writeValue(file, data)
	override fun readFromFile(file: File): Page = resolvers.objectMapper().readValue(file, Page::class.java)
}