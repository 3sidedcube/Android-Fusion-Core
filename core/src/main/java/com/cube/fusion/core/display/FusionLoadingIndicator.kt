package com.cube.fusion.core.display

/**
 * Interface for a generic indicator of loading state for page display
 *
 * Created by JR Mitchell on 24/December/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
fun interface FusionLoadingIndicator {
	/**
	 * Set the loading state for displayed data
	 */
	fun setLoadingState(isLoading: Boolean)
}