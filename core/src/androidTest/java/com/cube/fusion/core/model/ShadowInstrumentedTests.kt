package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Shadow] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ShadowInstrumentedTests {
	/**
	 * Test that a [Shadow] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsShadowParcelEquality() = assertEqualityAcrossParcelisation(Shadow())

	/**
	 * Test that a [Shadow] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteShadowParcelEquality() = assertEqualityAcrossParcelisation(ShadowTestData.COMPLETE_SHADOW)

	/**
	 * Test that a [Shadow] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsShadowBundleEquality() = assertEqualityAcrossBundleWriting(Shadow())

	/**
	 * Test that a [Shadow] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteShadowBundleEquality() = assertEqualityAcrossBundleWriting(ShadowTestData.COMPLETE_SHADOW)
}
