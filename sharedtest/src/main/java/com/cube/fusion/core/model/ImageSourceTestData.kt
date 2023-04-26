package com.cube.fusion.core.model

/**
 * Object containing useful data for [ImageSource] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ImageSourceTestData {

	/**
	 * The JSON data expected to parse to an instance of [ImageSource] constructed with no arguments
	 */
	const val NO_ARGS_IMAGE_SOURCE_JSON = "{ }"

	/**
	 * The JSON data expected to parse to an instance of [ImageSource] with every property specified as a non-default value
	 */
	val COMPLETE_IMAGE_SOURCE_JSON = """
		{
			"url": "image_url",
			"id": "src_id",
			"permalink": "permalink_url",
			"api_url": "src_url"
		}
	""".trimIndent()

	/**
	 * An instance of [ImageSource] expected to match the parsed value of [COMPLETE_IMAGE_SOURCE_JSON]
	 */
	val COMPLETE_IMAGE_SOURCE = ImageSource(
		url = "image_url",
		id = "src_id",
		permalink = "permalink_url",
		apiUrl = "src_url"
	)
}
