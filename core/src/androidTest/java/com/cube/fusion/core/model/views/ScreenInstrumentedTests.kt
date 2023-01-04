package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Screen] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ScreenInstrumentedTests {
	/**
	 * Test that a [Screen] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsScreenParcelEquality() = assertEqualityAcrossParcelisation(Screen())

	/**
	 * Test that a [Screen] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteScreenParcelEquality() = assertEqualityAcrossParcelisation(ScreenTestData.COMPLETE_SCREEN)

	/**
	 * Test that a [Screen] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsScreenBundleEquality() = assertEqualityAcrossBundleWriting(Screen())

	/**
	 * Test that a [Screen] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteScreenBundleEquality() = assertEqualityAcrossBundleWriting(ScreenTestData.COMPLETE_SCREEN)
}
