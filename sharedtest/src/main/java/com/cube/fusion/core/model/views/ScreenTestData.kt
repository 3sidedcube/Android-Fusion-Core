package com.cube.fusion.core.model.views

import com.cube.fusion.core.extensions.StringExtensions.tabIndented
import com.cube.fusion.core.extensions.StringExtensions.trimJsonContainer
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
	 * The JSON data expected to be serialised from an instance of [BulletGroup] constructed with no arguments
	 */
	val DEFAULT_SCREEN_JSON = """
		{
			"class": "Screen",
			"children": [ ]
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [Screen] with every property specified as a non-default value
	 */
	val COMPLETE_SCREEN_JSON = """
		{
			"class": "Screen",
			"children": [
				${BulletGroupTestData.COMPLETE_BULLET_GROUP_JSON.tabIndented(4)},
				${BulletTestData.COMPLETE_BULLET_JSON.tabIndented(4)},
				${ButtonTestData.COMPLETE_BUTTON_JSON.tabIndented(4)},
				${DividerTestData.COMPLETE_DIVIDER_JSON.tabIndented(4)},
				${ImageTestData.COMPLETE_IMAGE_JSON.tabIndented(4)},
				${ListItemTestData.COMPLETE_LIST_ITEM_JSON.tabIndented(4)},
				${TextTestData.COMPLETE_TEXT_JSON.tabIndented(4)}
			],
			${BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES_JSON.trimJsonContainer().tabIndented(2)}
		}
	""".trimIndent()

	/**
	 * An instance of [Screen] expected to match the parsed value of [COMPLETE_SCREEN_JSON]
	 */
	val COMPLETE_SCREEN = Screen(
		mutableListOf(
			BulletGroupTestData.COMPLETE_BULLET_GROUP,
			BulletTestData.COMPLETE_BULLET,
			ButtonTestData.COMPLETE_BUTTON,
			DividerTestData.COMPLETE_DIVIDER,
			ImageTestData.COMPLETE_IMAGE,
			ListItemTestData.COMPLETE_LIST_ITEM,
			TextTestData.COMPLETE_TEXT
		),
		baseProperties = BaseViewPropertiesTestData.COMPLETE_BASE_VIEW_PROPERTIES
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
		TrivialViewResolver(Text::class.java),
		ExtensionTestData.EXTENSION_RESOLVER
	)
}
