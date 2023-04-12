package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Screen] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ScreenJVMTests {
	/**
	 * Test that the relevant JSON data for a [Screen] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsScreenDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Screen(),
		ScreenTestData.NO_ARGS_SCREEN_JSON,
		ScreenTestData.SCREEN_TEST_RESOLVERS
	)

	/**
	 * Test that the relevant JSON data for a [Screen] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteScreenDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ScreenTestData.COMPLETE_SCREEN,
		ScreenTestData.COMPLETE_SCREEN_JSON,
		ScreenTestData.SCREEN_TEST_RESOLVERS
	)

	/**
	 * Test that an [Screen] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsScreenSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Screen(),
		ScreenTestData.DEFAULT_SCREEN_JSON
	)

	/**
	 * Test that an [Screen] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteScreenSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ScreenTestData.COMPLETE_SCREEN,
		ScreenTestData.COMPLETE_SCREEN_JSON
	)
}
