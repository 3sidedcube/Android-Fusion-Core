package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Margin] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class MarginInstrumentedTests {
	/**
	 * Test that a [Margin] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsMarginParcelEquality() = assertEqualityAcrossParcelisation(Margin())

	/**
	 * Test that a [Margin] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteMarginParcelEquality() = assertEqualityAcrossParcelisation(MarginTestData.COMPLETE_MARGIN)

	/**
	 * Test that a [Margin] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsMarginBundleEquality() = assertEqualityAcrossBundleWriting(Margin())

	/**
	 * Test that a [Margin] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteMarginBundleEquality() = assertEqualityAcrossBundleWriting(MarginTestData.COMPLETE_MARGIN)
}
