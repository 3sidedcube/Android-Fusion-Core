package com.cube.fusion.core.model.action

import com.cube.fusion.core.extensions.StringExtensions.tabIndented
import com.cube.fusion.core.model.UrlLinkTestData

/**
 * Object containing useful data for [PageAction] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object PageActionTestData {

	/**
	 * The JSON data expected to parse to an instance of [PageAction] constructed with no arguments
	 */
	val NO_ARGS_PAGE_ACTION_JSON = """
		{
			"class": "PageAction"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [PageAction] with every property specified as a non-default value
	 */
	val COMPLETE_PAGE_ACTION_JSON = """
		{
			"class": "PageAction",
			"entry": ${UrlLinkTestData.COMPLETE_URL_LINK_JSON.tabIndented(3)}
		}
	""".trimIndent()

	/**
	 * An instance of [PageAction] expected to match the parsed value of [COMPLETE_PAGE_ACTION_JSON]
	 */
	val COMPLETE_PAGE_ACTION = PageAction(
		entry = UrlLinkTestData.COMPLETE_URL_LINK
	)
}
