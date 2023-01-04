package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [BulletGroup] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class BulletGroupInstrumentedTests {
	/**
	 * Test that a [BulletGroup] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsBulletGroupParcelEquality() = assertEqualityAcrossParcelisation(BulletGroup())

	/**
	 * Test that a [BulletGroup] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteBulletGroupParcelEquality() = assertEqualityAcrossParcelisation(BulletGroupTestData.COMPLETE_BULLET_GROUP)

	/**
	 * Test that a [BulletGroup] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsBulletGroupBundleEquality() = assertEqualityAcrossBundleWriting(BulletGroup())

	/**
	 * Test that a [BulletGroup] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteBulletGroupBundleEquality() = assertEqualityAcrossBundleWriting(BulletGroupTestData.COMPLETE_BULLET_GROUP)
}
