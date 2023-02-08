package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.FontTestData
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.model.ModelTestData.withCompleteModelProperties
import com.cube.fusion.core.model.TextAlignment
import com.cube.fusion.core.model.action.EmailActionTestData

/**
 * Object containing useful data for [ListItem] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ListItemTestData {

	/**
	 * The JSON data expected to parse to an instance of [ListItem] constructed with no arguments
	 */
	val NO_ARGS_LIST_ITEM_JSON = """
		{
			"class": "ListItem"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [ListItem] with every property specified as a non-default value
	 */
	val COMPLETE_LIST_ITEM_JSON = """
		{
			"class": "ListItem",
			"title": ${TextTestData.COMPLETE_TEXT_JSON},
			"subtitle": {
				"class": "Text",
				"text_color": "#DDEECC",
				"content": "SubtitleTextContent",
				"font": ${FontTestData.COMPLETE_FONT_JSON},
				"text_alignment": "left",
				"number_of_lines": 3,
				"line_height": 7.1,
				"letter_spacing": 9.88,
				${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
			},
			"image": ${ImageTestData.COMPLETE_IMAGE_JSON},
			"action": ${EmailActionTestData.COMPLETE_EMAIL_ACTION_JSON},
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [ListItem] expected to match the parsed value of [COMPLETE_LIST_ITEM_JSON]
	 */
	val COMPLETE_LIST_ITEM = ListItem(
		title = TextTestData.COMPLETE_TEXT,
		subtitle = Text(
			textColor = "#DDEECC",
			content = "SubtitleTextContent",
			font = FontTestData.COMPLETE_FONT,
			textAlignment = TextAlignment.START,
			numberOfLines = 3,
			lineHeight = 7.1f,
			letterSpacing = 9.88f
		).withCompleteModelProperties(),
		image = ImageTestData.COMPLETE_IMAGE,
		action = EmailActionTestData.COMPLETE_EMAIL_ACTION
	).withCompleteModelProperties()
}
