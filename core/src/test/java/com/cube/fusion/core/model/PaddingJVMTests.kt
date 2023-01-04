package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Padding] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class PaddingJVMTests {
	/**
	 * Test that the relevant JSON data for a [Padding] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsPaddingDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Padding(),
		PaddingTestData.NO_ARGS_PADDING_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Padding] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompletePaddingDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		PaddingTestData.COMPLETE_PADDING,
		PaddingTestData.COMPLETE_PADDING_JSON
	)
	
	/**
	 * Test that the relevant JSON data for a [Padding] instance with zero margin matches the zero margin method
	 */
	@Test
	fun testZeroPaddingDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Padding.zeroPadding(),
		PaddingTestData.ZERO_PADDING_JSON
	)
}
