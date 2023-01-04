package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [ListItem] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ListItemJVMTests {
	/**
	 * Test that the relevant JSON data for a [ListItem] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsListItemDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ListItem(),
		ListItemTestData.NO_ARGS_LIST_ITEM_JSON
	)

	/**
	 * Test that the relevant JSON data for a [ListItem] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteListItemDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ListItemTestData.COMPLETE_LIST_ITEM,
		ListItemTestData.COMPLETE_LIST_ITEM_JSON
	)
}
