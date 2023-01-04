package com.cube.fusion.core.model

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [UrlLink] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class UrlLinkJVMTests {
	/**
	 * Test that the relevant JSON data for a [UrlLink] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsUrlLinkDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		UrlLink(),
		UrlLinkTestData.NO_ARGS_URL_LINK_JSON
	)

	/**
	 * Test that the relevant JSON data for a [UrlLink] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteUrlLinkDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		UrlLinkTestData.COMPLETE_URL_LINK,
		UrlLinkTestData.COMPLETE_URL_LINK_JSON
	)
}
