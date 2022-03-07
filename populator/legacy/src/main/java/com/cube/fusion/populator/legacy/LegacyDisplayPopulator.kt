package com.cube.fusion.populator.legacy

import com.cube.fusion.core.display.FusionDisplayPopulator
import com.cube.fusion.core.display.FusionDisplayTarget
import com.cube.fusion.core.display.FusionLoadingIndicator
import com.cube.fusion.core.exception.UnsuccessfulResponseError
import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.populator.legacy.api.APIFactory
import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * [FusionDisplayPopulator] implementation recreating the behaviour of the Fusion library prior to the abstraction out of content loading logic
 *
 * @property resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
 *
 * Created by JR Mitchell on 24/December/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class LegacyDisplayPopulator(val resolvers: Collection<ViewResolver>) : FusionDisplayPopulator {
	override fun populateDisplayFromUri(screenLink: String, target: FusionDisplayTarget, loadingIndicator: FusionLoadingIndicator) {
		loadingIndicator.setLoadingState(true)
		// Remove prefix from link if necessary
		val unqualifiedLink = screenLink.removePrefix(APIFactory.url)
		// Fetch result
		CoroutineScope(Dispatchers.Main).launch {
			val result = runCatching {
				val response = APIFactory.getAPI().getContentByLinkAsync(unqualifiedLink).await()
				loadingIndicator.setLoadingState(false)
				if (response.isSuccessful) {
					val mapper = ObjectMapper()
					resolvers.forEach {
						mapper.registerSubtypes(it.resolveView())
					}
					return@runCatching mapper.readValue(response.body()!!.data.toString(), Page::class.java)
				}
				else {
					throw UnsuccessfulResponseError() //Is caught and handled by runCatching
				}
			}
			result.fold(target::displayPage, target::displayError)
		}
	}
}