package com.cube.fusion.core.model.action

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [LinkAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class LinkActionJVMTests {
	/**
	 * Test that the relevant JSON data for a [LinkAction] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsLinkActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		LinkAction(),
		LinkActionTestData.NO_ARGS_LINK_ACTION_JSON
	)

	/**
	 * Test that the relevant JSON data for a [LinkAction] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteLinkActionDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		LinkActionTestData.COMPLETE_LINK_ACTION,
		LinkActionTestData.COMPLETE_LINK_ACTION_JSON
	)

	/**
	 * Test that an [LinkAction] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsLinkActionSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		LinkAction(),
		LinkActionTestData.DEFAULT_LINK_ACTION_JSON
	)

	/**
	 * Test that an [LinkAction] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteLinkActionSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		LinkActionTestData.COMPLETE_LINK_ACTION,
		LinkActionTestData.COMPLETE_LINK_ACTION_JSON
	)
}
