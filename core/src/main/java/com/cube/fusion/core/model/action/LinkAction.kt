package com.cube.fusion.core.model.action

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * This class contains the data for an action that is handled by linking to a webpage
 *
 * Created by Nikos Rapousis on 25/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property link the URL string of the webpage to link to
 * @property inApp whether the webpage should be opened in-app.
 *  If false, the webpage should be opened in an external app.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class LinkAction(
	var link: String? = null,
	var inApp: Boolean = false
) : Action() {
	override fun extractClick(): String? {
		return link
	}
}
