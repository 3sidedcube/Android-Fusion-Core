package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [ImageSource] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class ImageSourceJVMTests {
	/**
	 * Test that the relevant JSON data for a [ImageSource] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsImageSourceDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ImageSource(),
		ImageSourceTestData.NO_ARGS_IMAGE_SOURCE_JSON
	)

	/**
	 * Test that the relevant JSON data for a [ImageSource] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteImageSourceDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		ImageSourceTestData.COMPLETE_IMAGE_SOURCE,
		ImageSourceTestData.COMPLETE_IMAGE_SOURCE_JSON
	)

	/**
	 * Test that a [ImageSource] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsImageSourceSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ImageSource(),
		ImageSourceTestData.NO_ARGS_IMAGE_SOURCE_JSON
	)

	/**
	 * Test that a [ImageSource] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteImageSourceSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		ImageSourceTestData.COMPLETE_IMAGE_SOURCE,
		ImageSourceTestData.COMPLETE_IMAGE_SOURCE_JSON
	)
}
