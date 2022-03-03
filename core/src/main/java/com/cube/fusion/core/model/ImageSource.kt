package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Representation of the source of an image that can be loaded into an appropriate view
 *
 * @property url if relevant, URL to the remote image source
 * @property id if relevant, the ID of the image source
 * @property permalink if relevant, a permalink to the image source
 * @property apiUrl if relevant, a link to the API source of the image
 *
 * Created by Nikos Rapousis on 09/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class ImageSource {
	var url: String? = null
	var id: String? = null
	var permalink: String? = null
	var apiUrl: String? = null
}