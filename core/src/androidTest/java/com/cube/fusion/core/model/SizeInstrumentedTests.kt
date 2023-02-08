package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Size] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class SizeInstrumentedTests {
	/**
	 * Test that a [Size] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsSizeParcelEquality() = assertEqualityAcrossParcelisation(Size())

	/**
	 * Test that a [Size] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteSizeParcelEquality() = assertEqualityAcrossParcelisation(SizeTestData.COMPLETE_SIZE)

	/**
	 * Test that a [Size] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsSizeBundleEquality() = assertEqualityAcrossBundleWriting(Size())

	/**
	 * Test that a [Size] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteSizeBundleEquality() = assertEqualityAcrossBundleWriting(SizeTestData.COMPLETE_SIZE)
}
