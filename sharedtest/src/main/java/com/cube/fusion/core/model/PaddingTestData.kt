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
			"left": 31.0,
			"top": 3.63,
			"right": 600.0,
			"bottom": 2234.5679
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to [Padding.zeroPadding]
	 */
	val ZERO_PADDING_JSON = """
		{
			"left": 0.0,
			"top": 0.0,
			"right": 0.0,
			"bottom": 0.0
		}
	""".trimIndent()

	/**
	 * The JSON data expected to be serialised from an instance of [Padding] constructed with no arguments
	 */
	val DEFAULT_PADDING_JSON = """
		{
			"left": 0.0,
			"top": 0.0,
			"right": 0.0,
			"bottom": 0.0
		}
	""".trimIndent()

	/**
	 * An instance of [Padding] expected to match the parsed value of [COMPLETE_PADDING_JSON]
	 */
	val COMPLETE_PADDING = Padding(
		left = 31f,
		top = 3.63f,
		right = 600f,
		bottom = 2234.5679f
	)
}
