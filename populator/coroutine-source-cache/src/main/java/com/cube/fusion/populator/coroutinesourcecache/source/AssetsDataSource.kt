package com.cube.fusion.populator.coroutinesourcecache.source

import android.content.Context
import java.io.InputStream
import java.lang.ref.WeakReference

/**
 * [FusionDataSource] implementation that retrieves data from the app's assets
 * Note that this keeps a [WeakReference] to the context, and so where possible, [updateContext] should be called before attempting to read or write
 *
 * Created by JR Mitchell on 18/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param context the context to initialise this cache from
 * @param screenNameTransform a transformation to apply to the screen link to turn it into the cache file name
 * @param DataType the type in which the data is stored
 */
abstract class AssetsDataSource<DataType>(context: Context, val screenNameTransform: (String) -> String): FusionDataSource<DataType>() {
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
	 * Reads a value of type [DataType] from an asset [InputStream]
	 *
	 * @param stream the input stream to read from
	 */
	abstract suspend fun readStream(stream: InputStream): DataType

	override suspend fun retrieve(screenLink: String): Result<DataType> = runCatching {
		contextRef.get()?.assets?.open(screenNameTransform(screenLink))?.let {
			return@runCatching readStream(it)
		}
		throw Throwable()
	}
}