package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.Model
import com.cube.fusion.core.processor.FusionDataPreprocessor
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Model representing a Divider view for separating elements on a screen
 *
 * Created by Nikos Rapousis on 08/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property strokeWidth the [Float] height of the divider, in density pixels (dp)
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Divider (
	val strokeWidth: Float? = null,
	@field:JsonUnwrapped val baseProperties: BaseViewProperties = BaseViewProperties()
) : Model() {
	/**
	 * Interface with concrete type for pre-processing [Divider]
	 */
	interface Preprocessor: FusionDataPreprocessor<Divider>
}