package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [BulletGroup] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class BulletGroupJVMTests {
	/**
	 * Test that the relevant JSON data for a [BulletGroup] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsBulletGroupDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		BulletGroup(),
		BulletGroupTestData.NO_ARGS_BULLET_GROUP_JSON,
		BulletGroupTestData.BULLET_GROUP_TEST_RESOLVERS
	)

	/**
	 * Test that the relevant JSON data for a [BulletGroup] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteBulletGroupDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		BulletGroupTestData.COMPLETE_BULLET_GROUP,
		BulletGroupTestData.COMPLETE_BULLET_GROUP_JSON,
		BulletGroupTestData.BULLET_GROUP_TEST_RESOLVERS
	)
}
