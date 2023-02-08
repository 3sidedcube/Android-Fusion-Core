package com.cube.fusion.core.model.action

/**
 * Object containing useful data for [LinkAction] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object LinkActionTestData {

	/**
	 * The JSON data expected to parse to an instance of [LinkAction] constructed with no arguments
	 */
	val NO_ARGS_LINK_ACTION_JSON = """
		{
			"class": "LinkAction"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [LinkAction] with every property specified as a non-default value
	 */
	val COMPLETE_LINK_ACTION_JSON = """
		{
			"class": "LinkAction",
			"link": "www.google.com",
			"in_app": true
		}
	""".trimIndent()

	/**
	 * An instance of [LinkAction] expected to match the parsed value of [COMPLETE_LINK_ACTION_JSON]
	 */
	val COMPLETE_LINK_ACTION = LinkAction(
		// TODO: Update LinkAction with a non-default constructor
	)
}
