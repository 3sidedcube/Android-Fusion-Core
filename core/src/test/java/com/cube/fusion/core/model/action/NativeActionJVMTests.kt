package com.cube.fusion.core.model.action

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [NativeAction] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class NativeActionJVMTests {
	/**
	 * Test that the relevant JSON data for a [NativeAction] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsNativeActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		NativeAction(null), // TODO: class needs a no-args constructor
		NativeActionTestData.NO_ARGS_NATIVE_ACTION_JSON
	)

	/**
	 * Test that the relevant JSON data for a [NativeAction] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteNativeActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		NativeActionTestData.COMPLETE_NATIVE_ACTION,
		NativeActionTestData.COMPLETE_NATIVE_ACTION_JSON
	)
}
