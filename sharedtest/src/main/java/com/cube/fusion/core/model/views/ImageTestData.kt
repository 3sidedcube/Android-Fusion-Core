package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.ImageSourceTestData
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.model.ModelTestData.withCompleteModelProperties

/**
 * Object containing useful data for [Image] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ImageTestData {

	/**
	 * The JSON data expected to parse to an instance of [Image] constructed with no arguments
	 */
	val NO_ARGS_IMAGE_JSON = """
		{
			"class": "Image"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Image] with every property specified as a non-default value
	 */
	val COMPLETE_IMAGE_JSON = """
		{
			"class": "Image",
			"src": ${ImageSourceTestData.COMPLETE_IMAGE_SOURCE_JSON},
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [Image] expected to match the parsed value of [COMPLETE_IMAGE_JSON]
	 */
	val COMPLETE_IMAGE = Image(
		src = ImageSourceTestData.COMPLETE_IMAGE_SOURCE
	).withCompleteModelProperties()
}
