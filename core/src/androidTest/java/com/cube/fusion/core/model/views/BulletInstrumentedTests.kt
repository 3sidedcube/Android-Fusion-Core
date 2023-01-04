package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Bullet] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class BulletInstrumentedTests {
	/**
	 * Test that a [Bullet] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsBulletParcelEquality() = assertEqualityAcrossParcelisation(Bullet())

	/**
	 * Test that a [Bullet] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteBulletParcelEquality() = assertEqualityAcrossParcelisation(BulletTestData.COMPLETE_BULLET)

	/**
	 * Test that a [Bullet] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsBulletBundleEquality() = assertEqualityAcrossBundleWriting(Bullet())

	/**
	 * Test that a [Bullet] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteBulletBundleEquality() = assertEqualityAcrossBundleWriting(BulletTestData.COMPLETE_BULLET)
}
