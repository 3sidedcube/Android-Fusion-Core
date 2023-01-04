package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.FontTestData
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.model.ModelTestData.withCompleteModelProperties
import com.cube.fusion.core.model.TextAlignment
import com.cube.fusion.core.resolver.TrivialViewResolver
import com.cube.fusion.core.resolver.ViewResolver

/**
 * Object containing useful data for [BulletGroup] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object BulletGroupTestData {

	/**
	 * The JSON data expected to parse to an instance of [BulletGroup] constructed with no arguments
	 */
	val NO_ARGS_BULLET_GROUP_JSON = """
		{
			"class": "BulletGroup"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [BulletGroup] with every property specified as a non-default value
	 */
	val COMPLETE_BULLET_GROUP_JSON = """
		{
			"class": "BulletGroup",
			"children": [
				${BulletTestData.COMPLETE_BULLET_JSON},
				{
					"class": "Bullet",
					"title": {
						"class": "Text",
						"text_color": "#ADEECC",
						"content": "BulletTitle2TextContent",
						"font": ${FontTestData.COMPLETE_FONT_JSON},
						"text_alignment": "right",
						"number_of_lines": 81,
						"line_height": 2.23,
						"letter_spacing": 1.11,
						${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
					},
					"subtitle": {
						"class": "Text",
						"text_color": "#DDEECC",
						"content": "BulletSubtitle2TextContent",
						"font": ${FontTestData.COMPLETE_FONT_JSON},
						"text_alignment": "justified",
						"number_of_lines": 33,
						"line_height": 7.19,
						"letter_spacing": 92.88,
						${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
					},
					"order": 32,
					${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
				}
			],
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [BulletGroup] expected to match the parsed value of [COMPLETE_BULLET_GROUP_JSON]
	 */
	val COMPLETE_BULLET_GROUP = BulletGroup(
		children = arrayListOf(
			BulletTestData.COMPLETE_BULLET,
			Bullet(
				title = Text(
					textColor = "#ADEECC",
					content = "BulletTitle2TextContent",
					font = FontTestData.COMPLETE_FONT,
					textAlignment = TextAlignment.END,
					numberOfLines = 81,
					lineHeight = 2.23f,
					letterSpacing = 1.11f,
				).withCompleteModelProperties(),
				subtitle = Text(
					textColor = "#DDEECC",
					content = "BulletSubtitle2TextContent",
					font = FontTestData.COMPLETE_FONT,
					textAlignment = TextAlignment.JUSTIFIED,
					numberOfLines = 33,
					lineHeight = 7.19f,
					letterSpacing = 92.88f
				).withCompleteModelProperties(),
				order = 32
			).withCompleteModelProperties()
		)
	).withCompleteModelProperties()

	/**
	 * The required view resolvers to deserialise [COMPLETE_BULLET_GROUP_JSON]
	 */
	val BULLET_GROUP_TEST_RESOLVERS = listOf<ViewResolver>(
		TrivialViewResolver(Bullet::class.java),
		TrivialViewResolver(Text::class.java)
	)
}
