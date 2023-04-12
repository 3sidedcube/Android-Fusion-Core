package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Text] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class TextJVMTests {
	/**
	 * Test that the relevant JSON data for a [Text] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsTextDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Text(),
		TextTestData.NO_ARGS_TEXT_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Text] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteTextDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		TextTestData.COMPLETE_TEXT,
		TextTestData.COMPLETE_TEXT_JSON
	)

	/**
	 * Test that an [Text] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsTextSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Text(),
		TextTestData.NO_ARGS_TEXT_JSON
	)

	/**
	 * Test that an [Text] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteTextSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		TextTestData.COMPLETE_TEXT,
		TextTestData.COMPLETE_TEXT_JSON
	)
}
