package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Divider] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class DividerInstrumentedTests {
	/**
	 * Test that a [Divider] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsDividerParcelEquality() = assertEqualityAcrossParcelisation(Divider())

	/**
	 * Test that a [Divider] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteDividerParcelEquality() = assertEqualityAcrossParcelisation(DividerTestData.COMPLETE_DIVIDER)

	/**
	 * Test that a [Divider] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsDividerBundleEquality() = assertEqualityAcrossBundleWriting(Divider())

	/**
	 * Test that a [Divider] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteDividerBundleEquality() = assertEqualityAcrossBundleWriting(DividerTestData.COMPLETE_DIVIDER)
}
