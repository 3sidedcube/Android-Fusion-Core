package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.views.extensions.TestExtension
import com.cube.fusion.core.resolver.TrivialViewResolver

object ExtensionTestData {
	val EXTENSION_RESOLVER = TrivialViewResolver(TestExtension::class.java)

	val COMPLETE_EXTENSION = TestExtension(
		"myText",
		true
	)

	val COMPLETE_EXTENSION_JSON = """
		{
			"class": "TestExtension",
			"my_text": "myText",
			"other_attribute": true
		}
	""".trimIndent()
}