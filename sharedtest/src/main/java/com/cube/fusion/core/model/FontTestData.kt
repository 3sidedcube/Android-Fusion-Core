package com.cube.fusion.core.model

/**
 * Object containing useful data for [Font] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object FontTestData {

	/**
	 * The JSON data expected to parse to an instance of [Font] constructed with no arguments
	 */
	const val NO_ARGS_FONT_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Font] with every property specified as a non-default value
	 */
	val COMPLETE_FONT_JSON = """
		{
			"name": "Open Sans",
			"weight": "regular",
			"size": 22.0
		}
	""".trimIndent()

	/**
	 * An instance of [Font] expected to match the parsed value of [COMPLETE_FONT_JSON]
	 */
	val COMPLETE_FONT = Font(
		name = "Open Sans",
		weight = Font.Weight.REGULAR,
		size = 22f
	)
}
