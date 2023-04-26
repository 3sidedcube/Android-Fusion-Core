package com.cube.fusion.core.model

/**
 * Object containing useful data for [UrlLink] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object UrlLinkTestData {

	/**
	 * The JSON data expected to parse to an instance of [UrlLink] constructed with no arguments
	 */
	const val NO_ARGS_URL_LINK_JSON = "{ }"

	/**
	 * The JSON data expected to parse to an instance of [UrlLink] with every property specified as a non-default value
	 */
	val COMPLETE_URL_LINK_JSON = """
		{
			"id": "page_id",
			"title": "My Page",
			"api_url": "page_url"
		}
	""".trimIndent()

	/**
	 * An instance of [UrlLink] expected to match the parsed value of [COMPLETE_URL_LINK_JSON]
	 */
	val COMPLETE_URL_LINK = UrlLink(
		id = "page_id",
		title = "My Page",
		apiUrl = "page_url"
	)
}
