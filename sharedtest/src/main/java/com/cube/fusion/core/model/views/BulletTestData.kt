package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.tabIndented
import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.FontTestData
import com.cube.fusion.core.model.TextAlignment

/**
 * Object containing useful data for [Bullet] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object BulletTestData {

	/**
	 * The JSON data expected to parse to an instance of [Bullet] constructed with no arguments
	 */
	val NO_ARGS_BULLET_JSON = """
		{
			"class": "Bullet"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to be serialised from an instance of [Bullet] constructed with no arguments
	 */
	val DEFAULT_BULLET_JSON = """
		{
			"class": "Bullet",
			"order": 0
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Bullet] with every property specified as a non-default value
	 */
	val COMPLETE_BULLET_JSON = """
		{
			"class": "Bullet",
			"title": ${TextTestData.COMPLETE_TEXT_JSON.tabIndented(3)},
			"subtitle": {
				"class": "Text",
				"text_color": "#DDEECC",
				"content": "BulletSubtitleTextContent",
				"font": ${FontTestData.COMPLETE_FONT_JSON.tabIndented(4)},
				"text_alignment": "left",
				"number_of_lines": 3,
				"line_height": 7.1,
				"letter_spacing": 9.88,
				${BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES_JSON.trimJsonContainer().tabIndented(3)}
			},
			"order": 16,
			${BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES_JSON.trimJsonContainer().tabIndented(2)}
		}
	""".trimIndent()

	/**
	 * An instance of [Bullet] expected to match the parsed value of [COMPLETE_BULLET_JSON]
	 */
	val COMPLETE_BULLET = Bullet(
		title = TextTestData.COMPLETE_TEXT,
		subtitle = Text(
			textColor = "#DDEECC",
			content = "BulletSubtitleTextContent",
			font = FontTestData.COMPLETE_FONT,
			textAlignment = TextAlignment.START,
			numberOfLines = 3,
			lineHeight = 7.1f,
			letterSpacing = 9.88f,
			baseProperties = BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES
		),
		order = 16,
		baseProperties = BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES
	)
}
