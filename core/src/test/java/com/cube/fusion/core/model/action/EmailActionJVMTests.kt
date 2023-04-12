package com.cube.fusion.core.model.action

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonSerialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [EmailAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class EmailActionJVMTests {
	/**
	 * Test that the relevant JSON data for a [EmailAction] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsEmailActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		EmailAction(),
		EmailActionTestData.NO_ARGS_EMAIL_ACTION_JSON
	)

	/**
	 * Test that the relevant JSON data for a [EmailAction] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteEmailActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		EmailActionTestData.COMPLETE_EMAIL_ACTION,
		EmailActionTestData.COMPLETE_EMAIL_ACTION_JSON
	)

	/**
	 * Test that an [EmailAction] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsEmailActionSerialisationEquality() = assertEqualityFromJsonSerialisation(
		EmailAction(),
		EmailActionTestData.NO_ARGS_EMAIL_ACTION_JSON
	)

	/**
	 * Test that an [EmailAction] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteEmailActionSerialisationEquality() = assertEqualityFromJsonSerialisation(
		EmailActionTestData.COMPLETE_EMAIL_ACTION,
		EmailActionTestData.COMPLETE_EMAIL_ACTION_JSON
	)
}
