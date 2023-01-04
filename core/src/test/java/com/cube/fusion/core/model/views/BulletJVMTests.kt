package com.cube.fusion.core.model.views

import com.cube.fusion.core.JsonTestUtils.assertEqualityFromJsonDeserialisation
import org.junit.Test

/**
 * Suite of JVM tests for ensuring [Bullet] class behaves as intended
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class BulletJVMTests {
	/**
	 * Test that the relevant JSON data for a [Bullet] instance with no arguments matches the no-args constructor
	 */
	@Test
	fun testNoArgsBulletDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		Bullet(),
		BulletTestData.NO_ARGS_BULLET_JSON
	)

	/**
	 * Test that the relevant JSON data for a [Bullet] instance with all arguments specified matches the reference instance
	 */
	@Test
	fun testCompleteBulletDeserialisationEquality() = assertEqualityFromJsonDeserialisation(
		BulletTestData.COMPLETE_BULLET,
		BulletTestData.COMPLETE_BULLET_JSON
	)
}
