package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

/**
 * Representation of a font specification in which to display a piece of text
 *
 * @property name the name of the font to use, e.g. "Open Sans"
 * @property weight the weight of the font. See [Weight].
 * @property size the font size, in scalable pixels (sp)
 *
 * Created by Nikos Rapousis on 09/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Font {
	/**
	 * Enum class representing different weights of font
	 *
	 * @property REGULAR regular weight font
	 * @property BOLD bold font
	 * @property SEMIBOLD semibold font - inbetween [REGULAR] and [BOLD]
	 * @property HEAVY heavy font - bolder than [BOLD]
	 * @property LIGHT light font - less bold than [REGULAR]
	 * @property ITALIC italic font
	 */
	enum class Weight {
		@JsonProperty("regular")
		REGULAR,

		@JsonProperty("bold")
		BOLD,

		@JsonProperty("semiBold")
		SEMIBOLD,

		@JsonProperty("heavy")
		HEAVY,

		@JsonProperty("light")
		LIGHT,

		@JsonProperty("italic")
		ITALIC,
	}

	/// Name of the font, e.g. "Open Sans"
	var name: String? = null

	/// Weight of the font, e.g. "Regular"
	var weight: Weight? = null

	/// Size of the font in pt, e.g. 10
	var size: Float? = null
}