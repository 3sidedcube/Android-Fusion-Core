package com.cube.fusion.core.model.views.extensions

import com.cube.fusion.core.model.Model
import kotlinx.parcelize.Parcelize

@Parcelize
class TestLocalisationExtension(
	val localisedText: Map<String, String> = emptyMap(),
	val defaultLanguage: String? = null
): Model()