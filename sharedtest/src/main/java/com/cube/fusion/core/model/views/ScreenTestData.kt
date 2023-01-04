package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
import com.cube.fusion.core.model.ModelTestData
import com.cube.fusion.core.resolver.TrivialViewResolver
import com.cube.fusion.core.resolver.ViewResolver

/**
 * Object containing useful data for [Screen] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ScreenTestData {

	/**
	 * The JSON data expected to parse to an instance of [Screen] constructed with no arguments
	 */
	val NO_ARGS_SCREEN_JSON = """
		{
			"class": "Screen"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Screen] with every property specified as a non-default value
	 */
	val COMPLETE_SCREEN_JSON = """
		{
			"class": "Screen",
			"children": [
				${BulletGroupTestData.COMPLETE_BULLET_GROUP_JSON},
				${BulletTestData.COMPLETE_BULLET_JSON},
				${ButtonTestData.COMPLETE_BUTTON_JSON},
				${DividerTestData.COMPLETE_DIVIDER_JSON},
				${ImageTestData.COMPLETE_IMAGE_JSON},
				${ListItemTestData.COMPLETE_LIST_ITEM_JSON},
				${TextTestData.COMPLETE_TEXT_JSON}
			],
			${ModelTestData.COMPLETE_MODEL_JSON.trimJsonContainer()}
		}
	""".trimIndent()

	/**
	 * An instance of [Screen] expected to match the parsed value of [COMPLETE_SCREEN_JSON]
	 */
	val COMPLETE_SCREEN = Screen(
		// TODO: Update Screen with a non-default constructor
	)

	/**
	 * The required view resolvers to deserialise [COMPLETE_SCREEN_JSON]
	 */
	val SCREEN_TEST_RESOLVERS = listOf<ViewResolver>(
		TrivialViewResolver(BulletGroup::class.java),
		TrivialViewResolver(Bullet::class.java),
		TrivialViewResolver(Button::class.java),
		TrivialViewResolver(Divider::class.java),
		TrivialViewResolver(Image::class.java),
		TrivialViewResolver(ListItem::class.java),
		TrivialViewResolver(Text::class.java)
	)
}
