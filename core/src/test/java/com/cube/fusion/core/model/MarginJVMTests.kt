package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Margin] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class MarginJVMTests {
	/**
	 * Test that the relevant JSON data for a [Margin] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsMarginDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Margin(),
		MarginTestData.NO_ARGS_MARGIN_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Margin] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteMarginDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		MarginTestData.COMPLETE_MARGIN,
		MarginTestData.COMPLETE_MARGIN_JSON
	)
}
