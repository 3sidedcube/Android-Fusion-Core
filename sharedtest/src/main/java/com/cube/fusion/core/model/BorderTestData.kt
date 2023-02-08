package com.cube.fusion.core.model

/**
 * Object containing useful data for [Border] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object BorderTestData {

	/**
	 * The JSON data expected to parse to an instance of [Border] constructed with no arguments
	 */
	const val NO_ARGS_BORDER_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Border] with every property specified as a non-default value
	 */
	val COMPLETE_BORDER_JSON = """
		{
			"stroke_width": 2.4,
			"color": "#CCEEFF"
		}
	""".trimIndent()

	/**
	 * An instance of [Border] expected to match the parsed value of [COMPLETE_BORDER_JSON]
	 */
	val COMPLETE_BORDER = Border(
		// TODO: Update Border with a non-default constructor
	)
}
