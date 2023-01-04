package com.cube.fusion.core.model

import com.cube.fusion.core.model.views.Bullet
import com.cube.fusion.core.model.views.BulletGroup
import com.cube.fusion.core.model.views.Button
import com.cube.fusion.core.model.views.Divider
import com.cube.fusion.core.model.views.Image
import com.cube.fusion.core.model.views.ListItem
import com.cube.fusion.core.model.views.Screen
import com.cube.fusion.core.model.views.ScreenTestData
import com.cube.fusion.core.model.views.Text
import com.cube.fusion.core.resolver.TrivialViewResolver
import com.cube.fusion.core.resolver.ViewResolver

/**
 * Object containing useful data for [Page] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object PageTestData {

	/**
	 * The JSON data expected to parse to an instance of [Page] constructed with no arguments
	 */
	const val NO_ARGS_PAGE_JSON = "{}"

	/**
	 * The JSON data expected to parse to an instance of [Page] with every property specified as a non-default value
	 */
	val COMPLETE_PAGE_JSON = """
		{
			"class": "Page",
			"id": "page_id",
			"slug": "page_slug",
			"title": "page_title",
			"analytics_screen_view": "page_analytics_screen_view",
			"screen": ${ScreenTestData.COMPLETE_SCREEN_JSON}
		}
	""".trimIndent()

	/**
	 * An instance of [Page] expected to match the parsed value of [COMPLETE_PAGE_JSON]
	 */
	val COMPLETE_PAGE = Page(
		// TODO: Update Page with a non-default constructor
	)

	/**
	 * The required view resolvers to deserialise [COMPLETE_PAGE_JSON]
	 */
	val PAGE_TEST_RESOLVERS = listOf<ViewResolver>(
		TrivialViewResolver(BulletGroup::class.java),
		TrivialViewResolver(Bullet::class.java),
		TrivialViewResolver(Button::class.java),
		TrivialViewResolver(Divider::class.java),
		TrivialViewResolver(Image::class.java),
		TrivialViewResolver(ListItem::class.java),
		TrivialViewResolver(Screen::class.java),
		TrivialViewResolver(Text::class.java)
	)
}
