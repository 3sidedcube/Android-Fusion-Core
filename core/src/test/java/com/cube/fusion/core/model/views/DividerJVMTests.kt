package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Divider] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class DividerJVMTests {
	/**
	 * Test that the relevant JSON data for a [Divider] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsDividerDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Divider(),
		DividerTestData.NO_ARGS_DIVIDER_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Divider] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteDividerDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		DividerTestData.COMPLETE_DIVIDER,
		DividerTestData.COMPLETE_DIVIDER_JSON
	)
}
