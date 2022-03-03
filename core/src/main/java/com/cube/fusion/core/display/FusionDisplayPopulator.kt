package com.cube.fusion.core.display

/**
 * Interface for populating a [FusionDisplayTarget] from page data
 *
 * Created by JR Mitchell on 24/December/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 */
fun interface FusionDisplayPopulator {
	/**
	 * Populate a [FusionDisplayTarget] with a page fetched from a given [screenLink]
	 *
	 * @param screenLink the link to fetch data based on
	 * @param target the target to display the fetched data in
	 * @param loadingIndicator the loading UI to update on fetching state
	 */
	fun populateDisplayFromUri(screenLink: String, target: FusionDisplayTarget, loadingIndicator: FusionLoadingIndicator)
}