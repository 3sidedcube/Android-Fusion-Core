package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.views.extensions.TestAnalyticsExtension
import com.cube.fusion.core.model.views.extensions.TestExtension
import com.cube.fusion.core.model.views.extensions.TestLocalisationExtension
import com.cube.fusion.core.resolver.TrivialViewResolver

object ExtensionTestData {
	val EXTENSION_RESOLVER = TrivialViewResolver(TestExtension::class.java)

	val COMPLETE_EXTENSION = TestExtension(
		localisation = TestLocalisationExtension(
			localisedText = mapOf("en" to "Hello", "es" to "Hola"),
			defaultLanguage = "en"
		),
		analytics = TestAnalyticsExtension(
			eventKey = "event",
			paramKey = "myParam",
			paramValue = "myValue"
		)
	)

	val COMPLETE_EXTENSION_JSON = """
		{
			"class": "TestExtension",
			"localisation": {
				"class": "TestLocalisationExtension",
				"localised_text": {
					"en": "Hello",
					"es": "Hola"
				},
				"default_language": "en"
			},
			"analytics": {
				"class": "TestAnalyticsExtension",
				"event_key": "event",
				"param_key": "myParam",
				"param_value": "myValue"
			}
		}
	""".trimIndent()
}