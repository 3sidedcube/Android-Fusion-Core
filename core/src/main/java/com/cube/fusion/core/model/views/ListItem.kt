package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.Model
import com.cube.fusion.core.model.action.Action
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Model representing a list item with optional start image, title and subtitle, and click action handling
 *
 * Created by Nikos Rapousis on 10/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property image the [Image] view to show at the start of the list item
 * @property title the title for the list item
 * @property subtitle the subtitle for the list item
 * @property action the action to handle when the button is pressed, if relevant
 */
@Parcelize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class ListItem(
	val image: Image? = null,
	val title: Text? = null,
	val subtitle: Text? = null,
	val action: Action? = null,
	@field:JsonUnwrapped val baseProperties: BaseViewProperties = BaseViewProperties()
) : Model()
