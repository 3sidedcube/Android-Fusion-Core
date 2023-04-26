package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Page] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class PageJVMTests {
	/**
	 * Test that the relevant JSON data for a [Page] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsPageDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Page(),
		PageTestData.NO_ARGS_PAGE_JSON,
		PageTestData.PAGE_TEST_RESOLVERS
	)

	/**
	 * Test that the relevant JSON data for a [Page] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompletePageDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		PageTestData.COMPLETE_PAGE,
		PageTestData.COMPLETE_PAGE_JSON,
		PageTestData.PAGE_TEST_RESOLVERS
	)

	/**
	 * Test that a [Page] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsPageSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		Page(),
		PageTestData.DEFAULT_PAGE_JSON
	)

	/**
	 * Test that a [Page] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompletePageSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		PageTestData.COMPLETE_PAGE,
		PageTestData.COMPLETE_PAGE_JSON
	)
}