package com.cube.fusion.core.model

/**
 * Object containing useful data for [Model] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ModelTestData {
	/**
	 * The JSON data expected to parse to an instance of [Model] with every property specified as a non-default value
	 */
	val COMPLETE_MODEL_JSON = """
		{
			"background_color": "#FFEEDD",
			"corner_radius": 3.2,
			"padding": ${PaddingTestData.COMPLETE_PADDING_JSON},
			"margin": ${MarginTestData.COMPLETE_MARGIN_JSON},
			"border": ${BorderTestData.COMPLETE_BORDER_JSON},
			"shadow": ${ShadowTestData.COMPLETE_SHADOW_JSON}
		}
	""".trimIndent()

	/**
	 * Temporary method for applying base model properties to a class that inherits model
	 * TODO remove; rework to use encapsulation rather than inheritance for these properties
	 */
	inline fun <reified T : Model> T.withCompleteModelProperties() = apply {
		backgroundColor = "#FFEEDD"
		cornerRadius = 3.2f
		padding = PaddingTestData.COMPLETE_PADDING
		margin = MarginTestData.COMPLETE_MARGIN
		border = BorderTestData.COMPLETE_BORDER
		shadow = ShadowTestData.COMPLETE_SHADOW
	}
}
