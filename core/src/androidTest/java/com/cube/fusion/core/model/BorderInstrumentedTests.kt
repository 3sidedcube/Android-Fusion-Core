package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Border] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class BorderInstrumentedTests {
	/**
	 * Test that a [Border] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsBorderParcelEquality() = assertEqualityAcrossParcelisation(Border())

	/**
	 * Test that a [Border] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteBorderParcelEquality() = assertEqualityAcrossParcelisation(BorderTestData.COMPLETE_BORDER)

	/**
	 * Test that a [Border] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsBorderBundleEquality() = assertEqualityAcrossBundleWriting(Border())

	/**
	 * Test that a [Border] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteBorderBundleEquality() = assertEqualityAcrossBundleWriting(BorderTestData.COMPLETE_BORDER)
}
