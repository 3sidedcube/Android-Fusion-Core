package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.ModelTestData

/**
 * Object containing useful data for [Divider] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object DividerTestData {

	/**
	 * The JSON data expected to parse to an instance of [Divider] constructed with no arguments
	 */
	val NO_ARGS_DIVIDER_JSON = """
		{
			"class": "Divider"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Divider] with every property specified as a non-default value
	 */
	val COMPLETE_DIVIDER_JSON = """
		{
			"class": "Divider",
			"stroke_width": "54.2",
			"subtitle": "Divider Subtitle",
			"order": 16,
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [Divider] expected to match the parsed value of [COMPLETE_DIVIDER_JSON]
	 */
	val COMPLETE_DIVIDER = Divider(
		// TODO: Update Divider with a non-default constructor
	)
}
