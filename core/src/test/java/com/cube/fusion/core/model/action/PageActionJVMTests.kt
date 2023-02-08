package com.cube.fusion.core.model.action

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [PageAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class PageActionJVMTests {
	/**
	 * Test that the relevant JSON data for a [PageAction] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsPageActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		PageAction(),
		PageActionTestData.NO_ARGS_PAGE_ACTION_JSON
	)

	/**
	 * Test that the relevant JSON data for a [PageAction] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompletePageActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		PageActionTestData.COMPLETE_PAGE_ACTION,
		PageActionTestData.COMPLETE_PAGE_ACTION_JSON
	)
}
