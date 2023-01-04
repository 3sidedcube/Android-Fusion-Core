package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.FontTestData
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.model.ModelTestData.withCompleteModelProperties
import com.cube.fusion.core.model.TextAlignment

/**
 * Object containing useful data for [Text] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object TextTestData {

	/**
	 * The JSON data expected to parse to an instance of [Text] constructed with no arguments
	 */
	val NO_ARGS_TEXT_JSON = """
		{
			"class": "Text"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Text] with every property specified as a non-default value
	 */
	val COMPLETE_TEXT_JSON = """
		{
			"class": "Text",
			"text_color": "#EEDDCC",
			"content": "TextContent",
			"font": ${FontTestData.COMPLETE_FONT_JSON},
			"text_alignment": "center",
			"number_of_lines": 6,
			"line_height": 5.2,
			"letter_spacing": 3.33,
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [Text] expected to match the parsed value of [COMPLETE_TEXT_JSON]
	 */
	val COMPLETE_TEXT = Text(
		textColor = "#EEDDCC",
		content = "TextContent",
		font = FontTestData.COMPLETE_FONT,
		textAlignment = TextAlignment.CENTER,
		numberOfLines = 6,
		lineHeight = 5.2f,
		letterSpacing = 3.33f
	).withCompleteModelProperties()

	/**
	 * Temporary method for applying base text properties to a class that inherits text
	 * TODO remove; rework to use encapsulation rather than inheritance for these properties
	 */
	inline fun <reified T : Text> T.withCompleteTextProperties() = apply {
		textColor = COMPLETE_TEXT.textColor
		content = COMPLETE_TEXT.content
		font = COMPLETE_TEXT.font
		textAlignment = COMPLETE_TEXT.textAlignment
		numberOfLines = COMPLETE_TEXT.numberOfLines
		lineHeight = COMPLETE_TEXT.lineHeight
		letterSpacing = COMPLETE_TEXT.letterSpacing
		backgroundColor = COMPLETE_TEXT.backgroundColor
		cornerRadius = COMPLETE_TEXT.cornerRadius
		padding = COMPLETE_TEXT.padding
		margin = COMPLETE_TEXT.margin
		border = COMPLETE_TEXT.border
		shadow = COMPLETE_TEXT.shadow
	}
}
