package com.cube.fusion.core.model.views.extensions

import com.cube.fusion.core.model.Model
import kotlinx.parcelize.Parcelize

@Parcelize
class TestAnalyticsExtension(
	val eventKey: String? = null,
	val paramKey: String? = null,
	val paramValue: String? = null
): Model()