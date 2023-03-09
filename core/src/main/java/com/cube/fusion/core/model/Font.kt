package com.cube.fusion.core.model

import android.os.Parcelable
import com.cube.fusion.core.model.Font.Weight
import com.cube.fusion.core.model.Font.Weight.BOLD
import com.cube.fusion.core.model.Font.Weight.HEAVY
import com.cube.fusion.core.model.Font.Weight.ITALIC
import com.cube.fusion.core.model.Font.Weight.LIGHT
import com.cube.fusion.core.model.Font.Weight.REGULAR
import com.cube.fusion.core.model.Font.Weight.SEMIBOLD
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Representation of a font specification in which to display a piece of text
 *
 * Created by Nikos Rapousis on 09/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property name the name of the font to use, e.g. "Open Sans"
 * @property weight the weight of the font. See [Weight].
 * @property size the font size, in scalable pixels (sp)
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
class Font(
	var name: String? = null,
	var weight: Weight? = null,
	var size: Float? = null
) : Parcelable {
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
}
