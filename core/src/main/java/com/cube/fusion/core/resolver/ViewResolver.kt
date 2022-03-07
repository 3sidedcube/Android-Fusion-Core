package com.cube.fusion.core.resolver

import com.cube.fusion.core.model.Model

/**
 * Interface for resolving a view's class when parsing JSON data
 *
 * Created by JR Mitchell on 03/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface ViewResolver {
	fun resolveView(): Class<out Model?>?
}