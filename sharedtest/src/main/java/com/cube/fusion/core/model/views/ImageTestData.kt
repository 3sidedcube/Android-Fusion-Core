package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.tabIndented
import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.ImageSourceTestData

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
			"src": ${ImageSourceTestData.COMPLETE_IMAGE_SOURCE_JSON.tabIndented(3)},
			${BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES_JSON.trimJsonContainer().tabIndented(2)}
		}
	""".trimIndent()

	/**
	 * An instance of [Image] expected to match the parsed value of [COMPLETE_IMAGE_JSON]
	 */
	val COMPLETE_IMAGE = Image(
		src = ImageSourceTestData.COMPLETE_IMAGE_SOURCE,
		baseProperties = BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES
	)
}
