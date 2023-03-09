package com.cube.fusion.core.model

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonTypeInfo(
	use = JsonTypeInfo.Id.NAME,
	include = JsonTypeInfo.As.PROPERTY,
	property = "class"
)
/**
 * Base class for all models for Fusion views
 * Contains all properties that most Fusion views should be able to configure their appearance with
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property class the class name of the view - used for JSON parsing
 * @property backgroundColor the hexadecimal colour code for the view's background colour.
 *  Ensure that your chosen UI library uses the right hex format (e.g RGBA or ARGB)
 * @property cornerRadius the corner radius, in density pixels (dp), of the view
 * @property padding the [Padding] to apply to the view, insetting the contents of the view
 * @property margin the [Margin] to apply to the view, insetting the view relative to its neighbouring views and/or the screen region
 * @property border the [Border] to display around the view
 * @property shadow the drop [Shadow] to display behind the view
 */
abstract class Model : Parcelable {
	// Class of the view
	open val `class`: String = javaClass.simpleName

	// Background `RGBAHex` color
	open var backgroundColor: String? = null

	/// Corner radius of container view in points
	open var cornerRadius: Float? = null

	// `Padding` for text insets
	open var padding: Padding? = null

	// `Margin` for insets relative to other content
	open var margin: Margin? = null

	// `Border` of the container
	open var border: Border? = null

	// Shadow of the container
	open var shadow: Shadow? = null
}