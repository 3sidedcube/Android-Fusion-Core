package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Border
import com.cube.fusion.core.model.Margin
import com.cube.fusion.core.model.Padding
import com.cube.fusion.core.model.Shadow
import com.cube.fusion.core.processor.FusionDataPreprocessor
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Base property container for Fusion view models
 * Contains all properties that most Fusion views should be able to configure their appearance with
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property backgroundColor the hexadecimal colour code for the view's background colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 * @property cornerRadius the corner radius, in density pixels (dp), of the view
 * @property padding the [Padding] to apply to the view, insetting the contents of the view
 * @property margin the [Margin] to apply to the view, insetting the view relative to its neighbouring views and/or the screen region
 * @property border the [Border] to display around the view
 * @property shadow the drop [Shadow] to display behind the view
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@Parcelize
data class BaseViewProperties (
	val backgroundColor: String? = null,
	val cornerRadius: Float? = null,
	val padding: Padding? = null,
	val margin: Margin? = null,
	val border: Border? = null,
	val shadow: Shadow? = null
): Parcelable {
	/**
	 * Interface with concrete type for pre-processing [BaseViewProperties]
	 */
	interface Preprocessor: FusionDataPreprocessor<BaseViewProperties>
}