package com.cube.fusion.core.model

/**
 * Object containing useful data for [Shadow] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ShadowTestData {

	/**
	 * The JSON data expected to parse to an instance of [Shadow] constructed with no arguments
	 */
	const val NO_ARGS_SHADOW_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Shadow] with every property specified as a non-default value
	 */
	val COMPLETE_SHADOW_JSON = """
		{
			"color": "#FFCC00",
			"alpha": 0.78,
			"x": 9.9,
			"y": 1.7,
			"blur": 3.2,
			"spread": 0.5
		}
	""".trimIndent()

	/**
	 * The JSON data expected to be serialised from an instance of [Shadow] constructed with no arguments
	 */
	val DEFAULT_SHADOW_JSON = """
		{
			"alpha": 1.0,
			"x": 0.0,
			"y": 0.0,
			"blur": 0.0,
			"spread": 0.0
		}
	""".trimIndent()

	/**
	 * An instance of [Shadow] expected to match the parsed value of [COMPLETE_SHADOW_JSON]
	 */
	val COMPLETE_SHADOW = Shadow(
		color = "#FFCC00",
		alpha = 0.78f,
		x = 9.9f,
		y = 1.7f,
		blur = 3.2f,
		spread = 0.5f
	)
}
