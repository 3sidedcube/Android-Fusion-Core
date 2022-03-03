package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Class representing a solid border around a view
 *
 * @property strokeWidth the width of the border
 * @property color the hexadecimal colour code for the border colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 *
 * Created by Nikos Rapousis on 10/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Border {
	var strokeWidth: Float = 0f
	var color: String? = null
}