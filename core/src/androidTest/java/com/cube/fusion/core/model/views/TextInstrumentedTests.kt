package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Text] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class TextInstrumentedTests {
	/**
	 * Test that a [Text] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsTextParcelEquality() = assertEqualityAcrossParcelisation(Text())

	/**
	 * Test that a [Text] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteTextParcelEquality() = assertEqualityAcrossParcelisation(TextTestData.COMPLETE_TEXT)

	/**
	 * Test that a [Text] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsTextBundleEquality() = assertEqualityAcrossBundleWriting(Text())

	/**
	 * Test that a [Text] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteTextBundleEquality() = assertEqualityAcrossBundleWriting(TextTestData.COMPLETE_TEXT)
}
