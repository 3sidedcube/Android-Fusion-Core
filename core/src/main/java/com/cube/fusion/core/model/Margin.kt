package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Specification for the margin around a single Fusion view
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property left the left margin in units of density pixels (dp)
 * @property top the top margin in units of density pixels (dp)
 * @property right the right margin in units of density pixels (dp)
 * @property bottom the bottom margin in units of density pixels (dp)
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Margin(
	val left: Float = 0.0f,
	val top: Float = 0.0f,
	val right: Float = 0.0f,
	val bottom: Float = 0.0f
) {

	companion object {
		/**
		 * Get an instance of [Margin] representing zero margin
		 * Note: currently functionally equivalent to the default constructor for [Margin],
		 *  but in case the default constructor behaviour changes,
		 *  this method can be relied on as a stable source of truth for zero margin
		 *
		 * @return an instance of [Margin] with zero margin
		 */
		fun zeroMargin() = Margin(
			left = 0f,
			top = 0f,
			right = 0f,
			bottom = 0f
		)
	}
}
