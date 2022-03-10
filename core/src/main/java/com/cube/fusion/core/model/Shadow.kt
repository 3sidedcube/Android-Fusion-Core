package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Class representing the drop shadow displayed behind a view
 *
 * Created by JR Mitchell on 10/November/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property color the hexadecimal colour code for the shadow.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 * @property alpha the display alpha of the shadow
 * @property x the x-offset of the shadow, in density pixels (dp)
 * @property y the y-offset of the shadow, in density pixels (dp)
 * @property blur the target gaussian blur factor for the shadow, in density pixels (dp)
 * @property spread the distance that the shadow should spread from the edge of the view, in density pixels (dp)
 */
class Shadow {
	var color: String? = null
	var alpha: Float = 1f
	var x: Float = 0f
	var y: Float = 0f
	var blur: Float = 0f
	var spread: Float = 0f
}