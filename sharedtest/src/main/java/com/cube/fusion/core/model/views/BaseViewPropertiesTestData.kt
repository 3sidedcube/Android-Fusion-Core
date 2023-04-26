package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.tabIndented
import com.cube.fusion.core.model.BorderTestData
import com.cube.fusion.core.model.MarginTestData
import com.cube.fusion.core.model.PaddingTestData
import com.cube.fusion.core.model.ShadowTestData

/**
 * Object containing useful data for [BaseViewProperties] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object BaseViewPropertiesTestData {
	/**
	 * The JSON data expected to parse to [COMPLETE_BASE_VIEW_PROPERTIES]
	 */
	val COMPLETE_BASE_VIEW_PROPERTIES_JSON = """
		{
			"background_color": "#FFEEDD",
			"corner_radius": 3.2,
			"padding": ${PaddingTestData.COMPLETE_PADDING_JSON.tabIndented(3)},
			"margin": ${MarginTestData.COMPLETE_MARGIN_JSON.tabIndented(3)},
			"border": ${BorderTestData.COMPLETE_BORDER_JSON.tabIndented(3)},
			"shadow": ${ShadowTestData.COMPLETE_SHADOW_JSON.tabIndented(3)},
			"extensions": ${ExtensionTestData.COMPLETE_EXTENSION_JSON.tabIndented(3)}
		}
	""".trimIndent()

	/**
	 * An instance of [BaseViewProperties] with every property specified as a non-default value
	 */
	val COMPLETE_BASE_VIEW_PROPERTIES = BaseViewProperties(
		backgroundColor = "#FFEEDD",
		cornerRadius = 3.2f,
		padding = PaddingTestData.COMPLETE_PADDING,
		margin = MarginTestData.COMPLETE_MARGIN,
		border = BorderTestData.COMPLETE_BORDER,
		shadow = ShadowTestData.COMPLETE_SHADOW,
		extensions = ExtensionTestData.COMPLETE_EXTENSION
	)
}
