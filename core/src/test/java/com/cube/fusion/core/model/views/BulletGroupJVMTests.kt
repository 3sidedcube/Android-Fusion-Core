package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils
import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import com.cube.fusion.core.model.action.EmailAction
import com.cube.fusion.core.model.action.EmailActionTestData
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [BulletGroup] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
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

	/**
	 * Test that an [BulletGroup] instance with no arguments serialises correctly
	 */
	@Test
	fun testNoArgsBulletGroupSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		BulletGroup(),
		BulletGroupTestData.DEFAULT_BULLET_GROUP_JSON
	)

	/**
	 * Test that an [BulletGroup] instance with all arguments specified serialises correctly
	 */
	@Test
	fun testCompleteBulletGroupSerialisationEquality() = JsonTestUtils.assertEqualityFromJsonSerialisation(
		BulletGroupTestData.COMPLETE_BULLET_GROUP,
		BulletGroupTestData.COMPLETE_BULLET_GROUP_JSON
	)
}
