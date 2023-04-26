package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Shadow] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ShadowJVMTests {
	/**
	 * Test that the relevant JSON data for a [Shadow] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsShadowDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Shadow(),
		ShadowTestData.NO_ARGS_SHADOW_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Shadow] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteShadowDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ShadowTestData.COMPLETE_SHADOW,
		ShadowTestData.COMPLETE_SHADOW_JSON
	)

	/**
	 * Test that a [Shadow] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsShadowSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Shadow(),
		ShadowTestData.NO_ARGS_SHADOW_JSON
	)

	/**
	 * Test that a [Shadow] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteShadowSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ShadowTestData.COMPLETE_SHADOW,
		ShadowTestData.COMPLETE_SHADOW_JSON
	)
}
