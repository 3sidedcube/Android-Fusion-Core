package com.cube.fusion.core.model.action

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [EmailAction] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
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
}
