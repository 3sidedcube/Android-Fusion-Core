package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Specification for the padding inside a single Fusion view
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property left the left padding in units of density pixels (dp)
 * @property top the top padding in units of density pixels (dp)
 * @property right the right padding in units of density pixels (dp)
 * @property bottom the bottom padding in units of density pixels (dp)
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Padding(
	val left: Float = 0.0f,
	val top: Float = 0.0f,
	val right: Float = 0.0f,
	val bottom: Float = 0.0f
) {

	companion object {
		/**
		 * Get an instance of [Padding] representing zero padding
		 * Note: currently functionally equivalent to the default constructor for [Padding],
		 *  but in case the default constructor behaviour changes,
		 *  this method can be relied on as a stable source of truth for zero padding
		 *
		 * @return an instance of [Padding] with zero padding
		 */
		fun zeroPadding() = Padding(
			left = 0f,
			top = 0f,
			right = 0f,
			bottom = 0f
		)
	}
}
