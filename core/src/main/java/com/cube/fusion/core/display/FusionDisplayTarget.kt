package com.cube.fusion.core.display

import com.cube.fusion.core.model.Page

/**
 * Interface for a generic target where Fusion [Page] data can be displayed
 *
 * Created by JR Mitchell on 24/December/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
interface FusionDisplayTarget {
	/**
	 * Display a [Page] in this [FusionDisplayTarget]
	 *
	 * @param page the page to display
	 */
	fun displayPage(page: Page)

	/**
	 * Display an error thrown during attempting to populate this [FusionDisplayTarget]
	 */
	fun displayError(throwable: Throwable? = null)
}