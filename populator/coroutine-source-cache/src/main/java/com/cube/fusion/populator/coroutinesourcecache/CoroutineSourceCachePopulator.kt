package com.cube.fusion.populator.coroutinesourcecache

import com.cube.fusion.core.display.FusionDisplayPopulator
import com.cube.fusion.core.display.FusionDisplayTarget
import com.cube.fusion.core.display.FusionLoadingIndicator
import com.cube.fusion.core.model.Page
import com.cube.fusion.populator.coroutinesourcecache.cache.FusionDataCache
import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * [FusionDisplayPopulator] implementation that asynchronously attempts to fetch data from a collection of data sources one by one, using Kotlin Coroutines.
 * The data sources will be iterated through in the order defined by their collection class (the order provided if passed using vararg) until a source successfully provides the page data.
 * Once a page has been retrieved, it will be cached in any subsequent sources which permit cacheing.
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param scopeFactory a method for retrieving the coroutine scope to use for this populator.
 *  For an instance of LifecycleOwner, pass this::lifecycleScope.
 * @param sources the collection of sources to attempt to fetch / cache data in.
 *  Be aware that they will be checked in collection order.
 */
open class CoroutineSourceCachePopulator(val scopeFactory: () -> CoroutineScope, val sources: Collection<FusionDataSource<Page>>) : FusionDisplayPopulator {
	constructor(scopeFactory: () -> CoroutineScope, vararg sources: FusionDataSource<Page>): this(scopeFactory, sources.toList())
	override fun populateDisplayFromUri(screenLink: String, target: FusionDisplayTarget, loadingIndicator: FusionLoadingIndicator) {
		loadingIndicator.setLoadingState(true)
		scopeFactory().launch(Dispatchers.Main) {
			var page: Page? = null
			var throwable: Throwable? = null
			val onSuccess: (Page) -> Unit = {
				page = it
				loadingIndicator.setLoadingState(false)
				target.displayPage(it)
			}
			val onFailure: (Throwable) -> Unit = {
				throwable?.addSuppressed(it)
				if(throwable == null) {
					throwable = it
				}
			}
			sources.forEach { source ->
				page.let { staticPage ->
					if (staticPage == null) {
						source.retrieve(screenLink).fold(onSuccess, onFailure)
					}
					else if (source is FusionDataCache<Page>) {
						source.cache(screenLink, staticPage)
					}
				}
			}
			if(page == null) {
				loadingIndicator.setLoadingState(false)
				target.displayError(throwable)
			}
		}
	}
}