package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.ImageSource
import com.cube.fusion.core.model.Model
import com.cube.fusion.core.processor.FusionDataPreprocessor
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Model representing a single image view
 *
 * Created by Nikos Rapousis on 09/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property src the source to load the image from
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Image (
	val src: ImageSource? = null,
	@field:JsonUnwrapped val baseProperties: BaseViewProperties = BaseViewProperties()
) : Model() {
	/**
	 * Interface with concrete type for pre-processing [Image]
	 */
	interface Preprocessor: FusionDataPreprocessor<Image>
}