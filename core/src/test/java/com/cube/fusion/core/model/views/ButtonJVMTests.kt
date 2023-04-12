package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Button] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ButtonJVMTests {
	/**
	 * Test that the relevant JSON data for a [Button] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsButtonDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Button(),
		ButtonTestData.NO_ARGS_BUTTON_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Button] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteButtonDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ButtonTestData.COMPLETE_BUTTON,
		ButtonTestData.COMPLETE_BUTTON_JSON
	)

	/**
	 * Test that an [Button] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsButtonSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Button(),
		ButtonTestData.NO_ARGS_BUTTON_JSON
	)

	/**
	 * Test that an [Button] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteButtonSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ButtonTestData.COMPLETE_BUTTON,
		ButtonTestData.COMPLETE_BUTTON_JSON
	)
}
