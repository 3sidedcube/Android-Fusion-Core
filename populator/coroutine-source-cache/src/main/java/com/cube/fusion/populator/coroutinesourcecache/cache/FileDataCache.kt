package com.cube.fusion.populator.coroutinesourcecache.cache

import android.content.Context
import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.objectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileNotFoundException
import java.lang.ref.WeakReference

/**
 * [FusionDataCache] implementation to store pages as JSON files
 * Note that this keeps a [WeakReference] to the context, and so where possible, [updateContext] should be called before attempting to read or write
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param context the context to initialise this cache from
 */
open class FileDataCache(context: Context, val suffix: String, val resolvers: Collection<ViewResolver>) : FusionDataCache {
	companion object {
		private const val DEFAULT_CACHE_DIRECTORY = "fusionCache/"
	}
	private var contextRef: WeakReference<Context> = WeakReference(context)

	/**
	 * Updates the stored context reference based on current context
	 *
	 * @param context the context to update the reference to
	 */
	fun updateContext(context: Context) {
		contextRef = WeakReference(context)
	}

	/**
	 * Gets a [File] for the directory in which to store the cache JSON files
	 * Defaults to a folder named "fusionCache" inside the context's cache directory
	 *
	 * @param context the context to use to get the directory
	 */
	protected open fun getCacheDir(context: Context) = File(context.cacheDir, DEFAULT_CACHE_DIRECTORY)

	/**
	 * Gets a [File] for a given screen link
	 *
	 * @param context the context to use to get the directory
	 * @param screenLink the screen link to get a file for
	 */
	private fun getFile(context: Context, screenLink: String): File {
		val dir = getCacheDir(context)
		if (!dir.exists()) {
			dir.mkdirs()
		}
		return File(getCacheDir(context), screenLink + suffix)
	}

	override suspend fun cache(screenLink: String, page: Page) {
		contextRef.get()?.let { context ->
			withContext(Dispatchers.IO) {
				val file = getFile(context, screenLink)
				resolvers.objectMapper().writeValue(file, page)
			}
		}
	}

	override suspend fun retrieve(screenLink: String): Result<Page> = runCatching {
		contextRef.get()?.let { context ->
			return@runCatching withContext(Dispatchers.IO) {
				val file = getFile(context, screenLink + suffix)
				if (file.exists()) {
					return@withContext resolvers.objectMapper().readValue(file, Page::class.java)
				}
				throw FileNotFoundException()
			}
		}
		throw Throwable()
	}
}