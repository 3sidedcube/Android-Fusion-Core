package com.cube.fusion.core.model

object ModelTestData {
	/**
	 * The JSON data expected to parse to an instance of [Model] with every property specified as a non-default value
	 */
	val COMPLETE_MODEL_JSON = """
		{
			"background_color": "#FFEEDD",
			"cornerRadius": 3.2,
			"padding": ${PaddingTestData.COMPLETE_PADDING_JSON},
			"margin": ${MarginTestData.COMPLETE_MARGIN_JSON},
			"border": ${BorderTestData.COMPLETE_BORDER_JSON},
			"shadow": ${ShadowTestData.COMPLETE_SHADOW_JSON}
		}
	""".trimIndent()
}
