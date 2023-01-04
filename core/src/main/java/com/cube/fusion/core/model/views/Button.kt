package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.Model
import com.cube.fusion.core.model.action.Action
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonUnwrapped
import kotlinx.parcelize.Parcelize

/**
 * Model representing a Button view
 *
 * Created by Nikos Rapousis on 12/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property action the action to handle when the button is pressed
 */
@Parcelize
class Button(
	var action: Action? = null,
	@field:JsonUnwrapped
	@field:JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "class",
		defaultImpl = Text::class
	)
	val baseProperties: Text = Text()
) : Model()