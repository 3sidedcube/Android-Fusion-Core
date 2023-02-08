package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Image] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ImageInstrumentedTests {
	/**
	 * Test that a [Image] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsImageParcelEquality() = assertEqualityAcrossParcelisation(Image())

	/**
	 * Test that a [Image] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteImageParcelEquality() = assertEqualityAcrossParcelisation(ImageTestData.COMPLETE_IMAGE)

	/**
	 * Test that a [Image] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsImageBundleEquality() = assertEqualityAcrossBundleWriting(Image())

	/**
	 * Test that a [Image] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteImageBundleEquality() = assertEqualityAcrossBundleWriting(ImageTestData.COMPLETE_IMAGE)
}
