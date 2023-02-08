package com.cube.fusion.core.model

/**
 * Object containing useful data for [Padding] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object PaddingTestData {

	/**
	 * The JSON data expected to parse to an instance of [Padding] constructed with no arguments
	 */
	const val NO_ARGS_PADDING_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Padding] with every property specified as a non-default value
	 */
	val COMPLETE_PADDING_JSON = """
		{
			"left": 31,
			"top": 3.63,
			"right": 600,
			"bottom": 2234.5678
		}
	""".trimIndent()

	/**
	 * An instance of [Padding] expected to match the parsed value of [COMPLETE_PADDING_JSON]
	 */
	val COMPLETE_PADDING = Padding(
		// TODO: Update Padding with a non-default constructor
	)
}
