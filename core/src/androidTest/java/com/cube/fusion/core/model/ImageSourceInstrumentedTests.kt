package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [ImageSource] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ImageSourceInstrumentedTests {
	/**
	 * Test that a [ImageSource] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsImageSourceParcelEquality() = assertEqualityAcrossParcelisation(ImageSource())

	/**
	 * Test that a [ImageSource] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteImageSourceParcelEquality() = assertEqualityAcrossParcelisation(ImageSourceTestData.COMPLETE_IMAGE_SOURCE)

	/**
	 * Test that a [ImageSource] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsImageSourceBundleEquality() = assertEqualityAcrossBundleWriting(ImageSource())

	/**
	 * Test that a [ImageSource] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteImageSourceBundleEquality() = assertEqualityAcrossBundleWriting(ImageSourceTestData.COMPLETE_IMAGE_SOURCE)
}
