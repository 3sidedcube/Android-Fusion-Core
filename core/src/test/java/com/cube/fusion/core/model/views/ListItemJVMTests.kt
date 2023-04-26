package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [ListItem] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
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
		ListItemTestData.COMPLETE_LIST_ITEM_JSON,
		ExtensionTestData.EXTENSION_RESOLVER
	)

	/**
	 * Test that an [ListItem] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsListItemSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ListItem(),
		ListItemTestData.NO_ARGS_LIST_ITEM_JSON
	)

	/**
	 * Test that an [ListItem] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteListItemSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ListItemTestData.COMPLETE_LIST_ITEM,
		ListItemTestData.COMPLETE_LIST_ITEM_JSON
	)
}
