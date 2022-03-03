package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.action.Action

/**
 * Model representing a Button view
 *
 * @property action the action to handle when the button is pressed
 *
 * Created by Nikos Rapousis on 12/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class Button : Text() {
	var action: Action? = null
}