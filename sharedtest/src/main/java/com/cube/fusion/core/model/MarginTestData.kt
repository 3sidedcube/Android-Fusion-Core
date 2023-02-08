package com.cube.fusion.core.model

/**
 * Object containing useful data for [Margin] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object MarginTestData {

	/**
	 * The JSON data expected to parse to an instance of [Margin] constructed with no arguments
	 */
	const val NO_ARGS_MARGIN_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Margin] with every property specified as a non-default value
	 */
	val COMPLETE_MARGIN_JSON = """
		{
			"left": 30,
			"top": 2.63,
			"right": 500,
			"bottom": 1234.5678
		}
	""".trimIndent()

	/**
	 * An instance of [Margin] expected to match the parsed value of [COMPLETE_MARGIN_JSON]
	 */
	val COMPLETE_MARGIN = Margin(
		// TODO: Update Margin with a non-default constructor
	)
}
