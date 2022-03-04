package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Model representing a Divider view for separating elements on a screen
 *
 * @property strokeWidth the [Float] height of the divider, in density pixels (dp)
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Divider : Model(), Parcelable {
	var strokeWidth: Float? = null
}