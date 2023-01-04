package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Padding] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class PaddingInstrumentedTests {
	/**
	 * Test that a [Padding] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsPaddingParcelEquality() = assertEqualityAcrossParcelisation(Padding())

	/**
	 * Test that a [Padding] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompletePaddingParcelEquality() = assertEqualityAcrossParcelisation(PaddingTestData.COMPLETE_PADDING)

	/**
	 * Test that a [Padding] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsPaddingBundleEquality() = assertEqualityAcrossBundleWriting(Padding())

	/**
	 * Test that a [Padding] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompletePaddingBundleEquality() = assertEqualityAcrossBundleWriting(PaddingTestData.COMPLETE_PADDING)
}
