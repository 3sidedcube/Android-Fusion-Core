package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Font
import com.cube.fusion.core.model.Model
import com.cube.fusion.core.model.TextAlignment
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * Model representing a single piece of text
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property textColor the hexadecimal colour code for the text colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 * @property content the text content of the view
 * @property font the [Font] style of the text
 * @property textAlignment the alignment of the text
 * @property numberOfLines the number of lines to show the text in
 * @property lineHeight the height of a single line of text
 * @property letterSpacing the spacing between letters, in ems
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
open class Text (
	var textColor: String? = null,
	var content: String? = null,
	var font: @RawValue Font? = null,
	var textAlignment: TextAlignment? = null,
	var numberOfLines: Int? = null,
	var lineHeight: Float? = null,
	var letterSpacing: Float? = null
)  : Model(), Parcelable