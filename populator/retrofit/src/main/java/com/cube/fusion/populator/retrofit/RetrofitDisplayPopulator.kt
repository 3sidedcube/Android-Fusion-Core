package com.cube.fusion.populator.retrofit

import com.cube.fusion.core.display.FusionDisplayPopulator
import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.populator.coroutinesourcecache.CoroutineSourceCachePopulator
import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource
import com.cube.fusion.populator.retrofit.source.RetrofitDataSource
import kotlinx.coroutines.CoroutineScope

/**
 * Convenience [FusionDisplayPopulator] implementation that asynchronously attempts to fetch data from an API using Retrofit.
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param DataType the expected parseable return type of the Retrofit API request
 * @param scopeFactory a method for retrieving the coroutine scope to use for this populator.
 *  For an instance of LifecycleOwner, pass this::lifecycleScope.
 * @param baseUrl the base URL of the API
 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
 * @param clazz the class to parse the API's returned data to
 * @param transform a transformation to convert the API data to a [Page]
 * @param backupSources a collection of sources to fall back on if the API call fails.
 *  If any are caches, then successful API call data will be cached in them.
 *  Be aware that they will be checked in collection order.
 *  Defaults to an empty list, i.e no fallback / cacheing behaviour.
 */
class RetrofitDisplayPopulator<DataType>(
	scopeFactory: () -> CoroutineScope,
	baseUrl: String,
	resolvers: Collection<ViewResolver>,
	clazz: Class<DataType>,
	transform: (DataType) -> Page,
	backupSources: Collection<FusionDataSource<Page>> = emptyList()
) : CoroutineSourceCachePopulator(scopeFactory, listOf(RetrofitDataSource(baseUrl, resolvers, clazz).map(transform)) + backupSources) {

	constructor(
		scopeFactory: () -> CoroutineScope,
		baseUrl: String,
		resolvers: Collection<ViewResolver>,
		clazz: Class<DataType>,
		transform: (DataType) -> Page,
		vararg backupSources: FusionDataSource<Page>
	): this(scopeFactory, baseUrl, resolvers, clazz, transform, backupSources.toList())

	companion object {
		/**
		 * Convenience [FusionDisplayPopulator] constructor-equivalent that asynchronously attempts to fetch [Page] data from an API using Retrofit.
		 *
		 * @param scopeFactory a method for retrieving the coroutine scope to use for this populator.
		 *  For an instance of LifecycleOwner, pass this::lifecycleScope.
		 * @param baseUrl the base URL of the API
		 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
		 * @param backupSources a collection of sources to fall back on if the API call fails.
		 *  If any are caches, then successful API call data will be cached in them.
		 *  Be aware that they will be checked in collection order.
		 *  Defaults to an empty list, i.e no fallback / cacheing behaviour.
		 */
		operator fun invoke(
			scopeFactory: () -> CoroutineScope,
			baseUrl: String,
			resolvers: Collection<ViewResolver>,
			backupSources: Collection<FusionDataSource<Page>> = emptyList()
		) = RetrofitDisplayPopulator(
			scopeFactory,
			baseUrl,
			resolvers,
			Page::class.java,
			{ it },
			backupSources
		)

		/**
		 * Convenience [FusionDisplayPopulator] constructor-equivalent that asynchronously attempts to fetch [Page] data from an API using Retrofit.
		 *
		 * @param scopeFactory a method for retrieving the coroutine scope to use for this populator.
		 *  For an instance of LifecycleOwner, pass this::lifecycleScope.
		 * @param baseUrl the base URL of the API
		 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
		 * @param backupSources a collection of sources to fall back on if the API call fails.
		 *  If any are caches, then successful API call data will be cached in them.
		 *  Be aware that they will be checked in collection order.
		 *  Defaults to an empty list, i.e no fallback / cacheing behaviour.
		 */
		operator fun invoke(
			scopeFactory: () -> CoroutineScope,
			baseUrl: String,
			resolvers: Collection<ViewResolver>,
			vararg backupSources: FusionDataSource<Page>
		) = RetrofitDisplayPopulator(
			scopeFactory,
			baseUrl,
			resolvers,
			backupSources.toList()
		)
	}
}