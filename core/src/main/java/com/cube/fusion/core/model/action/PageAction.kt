package com.cube.fusion.core.model.action

import com.cube.fusion.core.model.UrlLink
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.parcelize.Parcelize

/**
 * This class contains the data of an action that is handled by redirecting to a new Fusion page
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property entry the link to the Fusion page entry to redirect to
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
class PageAction(var entry: UrlLink? = null) : Action() {
	override fun extractClick(): String? {
		return entry?.apiUrl
	}
}
