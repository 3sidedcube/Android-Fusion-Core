package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Border] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class BorderJVMTests {
	/**
	 * Test that the relevant JSON data for a [Border] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsBorderDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Border(),
		BorderTestData.NO_ARGS_BORDER_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Border] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteBorderDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		BorderTestData.COMPLETE_BORDER,
		BorderTestData.COMPLETE_BORDER_JSON
	)

	/**
	 * Test that a [Border] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsBorderSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Border(),
		BorderTestData.DEFAULT_BORDER_JSON
	)

	/**
	 * Test that a [Border] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteBorderSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		BorderTestData.COMPLETE_BORDER,
		BorderTestData.COMPLETE_BORDER_JSON
	)
}
