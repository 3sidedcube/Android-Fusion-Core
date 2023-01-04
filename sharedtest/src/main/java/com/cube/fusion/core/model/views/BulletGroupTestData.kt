package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.FontTestData
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.resolver.TrivialViewResolver

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
						"textColor": "#ADEECC",
						"content": "BulletTitle2TextContent",
						"font": ${FontTestData.COMPLETE_FONT_JSON},
						"textAlignment": "right",
						"numberOfLines": 81,
						"lineHeight": 2.23,
						"letterSpacing": 1.11,
						${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
					},
					"subtitle": {
						"class": "Text",
						"textColor": "#DDEECC",
						"content": "BulletSubtitle2TextContent",
						"font": ${FontTestData.COMPLETE_FONT_JSON},
						"textAlignment": "justified",
						"numberOfLines": 33,
						"lineHeight": 7.19,
						"letterSpacing": 92.88,
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
		// TODO: Update BulletGroup with a non-default constructor
	)

	/**
	 * The required view resolvers to deserialise [COMPLETE_BULLET_GROUP_JSON]
	 */
	val BULLET_GROUP_TEST_RESOLVERS = listOf<ViewResolver>(
		TrivialViewResolver(Bullet::class.java),
		TrivialViewResolver(Text::class.java)
	)
}
