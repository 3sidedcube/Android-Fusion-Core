package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Representation of a link to a Fusion page
 *
 * @property id the ID of the page to link to
 * @property title the title of the page to link to
 * @property apiUrl the URL of the page to link to
 *
 * Created by Nikos Rapousis on 12/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class UrlLink {
	var id: String? = null
	var title: String? = null
	var apiUrl: String? = null
}
