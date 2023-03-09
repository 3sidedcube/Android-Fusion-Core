package com.cube.fusion.core.model

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Class representing a solid border around a view
 *
 * Created by Nikos Rapousis on 10/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property strokeWidth the width of the border
 * @property color the hexadecimal colour code for the border colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
class Border(
	var strokeWidth: Float = 0f,
	var color: String? = null
): Parcelable