package com.cube.fusion.core.model.views.extensions

import com.cube.fusion.core.model.Model
import kotlinx.parcelize.Parcelize

@Parcelize
class TestExtension(
	val myText: String? = null,
	val otherAttribute: Boolean? = null
) : Model()