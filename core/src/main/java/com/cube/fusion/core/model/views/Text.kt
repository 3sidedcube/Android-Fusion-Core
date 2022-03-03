package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Font
import com.cube.fusion.core.model.Model
import com.cube.fusion.core.model.TextAlignment
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Model representing a single piece of text
 *
 * @property textColor the hexadecimal colour code for the text colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 * @property content the text content of the view
 * @property font the [Font] style of the text
 * @property textAlignment the alignment of the text
 * @property numberOfLines the number of lines to show the text in
 * @property lineHeight the height of a single line of text
 * @property letterSpacing the spacing between letters, in ems
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
open class Text : Model(), Parcelable {
	var textColor: String? = null

	var content: String? = null

	// `Font` style of the text
	var font: Font? = null

	// `TextAlignment`
	var textAlignment: TextAlignment? = null

	// Number of lines to show this text in
	var numberOfLines: Int? = null

	// Height of the line
	var lineHeight: Float? = null

	// Letter spacing
	var letterSpacing: Float? = null
}