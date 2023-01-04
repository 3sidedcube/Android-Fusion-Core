package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.extensions.StringExtensions.withoutClass
import com.cube.fusion.core.model.action.LinkActionTestData

/**
 * Object containing useful data for [Button] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ButtonTestData {

	/**
	 * The JSON data expected to parse to an instance of [Button] constructed with no arguments
	 */
	val NO_ARGS_BUTTON_JSON = """
		{
			"class": "Button"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Button] with every property specified as a non-default value
	 */
	val COMPLETE_BUTTON_JSON = """
		{
			"class": "Button",
			"action": ${LinkActionTestData.COMPLETE_LINK_ACTION_JSON},
			${TextTestData.COMPLETE_TEXT_JSON.trimJsonContainer().withoutClass()}
		}
	""".trimIndent()

	/**
	 * An instance of [Button] expected to match the parsed value of [COMPLETE_BUTTON_JSON]
	 */
	val COMPLETE_BUTTON = Button(
		action = LinkActionTestData.COMPLETE_LINK_ACTION,
		baseProperties = TextTestData.COMPLETE_TEXT
	)
}
