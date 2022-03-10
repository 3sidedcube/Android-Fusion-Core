package com.cube.fusion.populator.coroutinesourcecache.source

/**
 * Abstract class representing a source where Fusion data can be asynchronously retrieved from using Kotlin Coroutines
 *
 * Created by JR Mitchell on 09/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param RetrievedType the type in which the data is retrieved
 */
abstract class FusionDataSource<RetrievedType> {

	/**
	 * Attempts to retrieve data from its screen link
	 *
	 * @param screenLink the link for the data
	 * @return the result of the retrieval attempt
	 */
	abstract suspend fun retrieve(screenLink: String): Result<RetrievedType>

	/**
	 * Retrieve a new [FusionDataSource] instance based on this one, with given data transformation
	 *
	 * @param transform the transformation to apply to every piece of data retrieved from this source
	 * @param [TransformedType] the type that data is transformed to after retrieving from this source
	 * @return a [FusionDataSource] instance that transforms retrieved data to [TransformedType] after retrieving from this source
	 */
	fun <TransformedType> map(transform: (RetrievedType) -> TransformedType) : FusionDataSource<TransformedType> = object : FusionDataSource<TransformedType>() {
		override suspend fun retrieve(screenLink: String): Result<TransformedType> = this@FusionDataSource.retrieve(screenLink).map(transform)
	}
}