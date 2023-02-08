package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * Container model for a list of models to display in a single Fusion screen
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property children the [Model]s representing views to display in the screen
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Screen(
	val children: @RawValue MutableList<Model> = mutableListOf()
) : Model(), Parcelable