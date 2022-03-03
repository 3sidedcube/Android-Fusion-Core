package com.cube.fusion.core.model

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Specification for the size of a view
 *
 * @property width the width of the view, in density pixels (dp)
 * @property height the height of the view, in density pixels (dp)
 *
 * Created by Nikos Rapousis on 09/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Size : Parcelable {
	var width: Float = 0.0f
	var height: Float = 0.0f
}