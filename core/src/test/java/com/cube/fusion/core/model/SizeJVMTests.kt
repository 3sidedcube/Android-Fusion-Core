package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Size] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class SizeJVMTests {
	/**
	 * Test that the relevant JSON data for a [Size] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsSizeDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Size(),
		SizeTestData.NO_ARGS_SIZE_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Size] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteSizeDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		SizeTestData.COMPLETE_SIZE,
		SizeTestData.COMPLETE_SIZE_JSON
	)
}
