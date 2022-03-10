package com.cube.fusion.populator.coroutinesourcecache.cache

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileNotFoundException
import java.lang.ref.WeakReference

/**
 * [FusionDataCache] implementation to store Fusion data as JSON files
 * Note that this keeps a [WeakReference] to the context, and so where possible, [updateContext] should be called before attempting to read or write
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param context the context to initialise this cache from
 * @param CachedType the type in which the data is cached
 */
abstract class FileDataCache<CachedType>(context: Context, val suffix: String) : FusionDataCache<CachedType>() {
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

	/**
	 * Writes some [CachedType] data to a given [File]
	 *
	 * @param file the file to write data to
	 * @param data the data to write to the [file]
	 */
	abstract fun writeToFile(file: File, data: CachedType)

	/**
	 * Reads some [CachedType] data from a given [File]
	 *
	 * @param file the file to read data from.
	 *  You should not need to check that the file exists.
	 * @return the [CachedType] data stored in that file
	 */
	abstract fun readFromFile(file: File): CachedType

	override suspend fun cache(screenLink: String, data: CachedType) {
		contextRef.get()?.let { context ->
			withContext(Dispatchers.IO) {
				val file = getFile(context, screenLink)
				writeToFile(file, data)
			}
		}
	}

	override suspend fun retrieve(screenLink: String): Result<CachedType> = runCatching {
		contextRef.get()?.let { context ->
			return@runCatching withContext(Dispatchers.IO) {
				val file = getFile(context, screenLink + suffix)
				if (file.exists()) {
					return@withContext readFromFile(file)
				}
				throw FileNotFoundException()
			}
		}
		throw Throwable()
	}
}