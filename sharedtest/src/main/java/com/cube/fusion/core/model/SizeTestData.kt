package com.cube.fusion.core.model

/**
 * Object containing useful data for [Size] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object SizeTestData {

	/**
	 * The JSON data expected to parse to an instance of [Size] constructed with no arguments
	 */
	const val NO_ARGS_SIZE_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Size] with every property specified as a non-default value
	 */
	val COMPLETE_SIZE_JSON = """
		{
			"width": 36.2,
			"height": 75.1
		}
	""".trimIndent()

	/**
	 * The JSON data expected to be serialised from an instance of [Size] constructed with no arguments
	 */
	val DEFAULT_SIZE_JSON = """
		{
			"width": 0.0,
			"height": 0.0
		}
	""".trimIndent()

	/**
	 * An instance of [Size] expected to match the parsed value of [COMPLETE_SIZE_JSON]
	 */
	val COMPLETE_SIZE = Size(
		width = 36.2f,
		height = 75.1f
	)
}
