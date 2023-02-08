package com.cube.fusion.core.model.action

/**
 * Object containing useful data for [NativeAction] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object NativeActionTestData {

	/**
	 * The JSON data expected to parse to an instance of [NativeAction] constructed with no arguments
	 */
	val NO_ARGS_NATIVE_ACTION_JSON = """
		{
			"class": "NativeAction"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [NativeAction] with every property specified as a non-default value
	 */
	val COMPLETE_NATIVE_ACTION_JSON = """
		{
			"class": "NativeAction",
			"link": "my_action"
		}
	""".trimIndent()

	/**
	 * An instance of [NativeAction] expected to match the parsed value of [COMPLETE_NATIVE_ACTION_JSON]
	 */
	val COMPLETE_NATIVE_ACTION = NativeAction(
		link = "my_action"
	)
}
