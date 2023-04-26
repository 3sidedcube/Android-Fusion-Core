package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Image] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ImageJVMTests {
	/**
	 * Test that the relevant JSON data for a [Image] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsImageDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Image(),
		ImageTestData.NO_ARGS_IMAGE_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Image] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteImageDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ImageTestData.COMPLETE_IMAGE,
		ImageTestData.COMPLETE_IMAGE_JSON,
		ExtensionTestData.EXTENSION_RESOLVER
	)

	/**
	 * Test that an [Image] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsImageSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Image(),
		ImageTestData.NO_ARGS_IMAGE_JSON
	)

	/**
	 * Test that an [Image] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteImageSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ImageTestData.COMPLETE_IMAGE,
		ImageTestData.COMPLETE_IMAGE_JSON,
		ExtensionTestData.EXTENSION_RESOLVER
	)
}
