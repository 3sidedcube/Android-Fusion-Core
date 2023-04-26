package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Font] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class FontJVMTests {
	/**
	 * Test that the relevant JSON data for a [Font] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsFontDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Font(),
		FontTestData.NO_ARGS_FONT_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Font] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteFontDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		FontTestData.COMPLETE_FONT,
		FontTestData.COMPLETE_FONT_JSON
	)

	/**
	 * Test that a [Font] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsFontSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Font(),
		FontTestData.NO_ARGS_FONT_JSON
	)

	/**
	 * Test that a [Font] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteFontSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		FontTestData.COMPLETE_FONT,
		FontTestData.COMPLETE_FONT_JSON
	)
}
