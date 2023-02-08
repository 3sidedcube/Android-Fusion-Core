package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Button] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ButtonInstrumentedTests {
	/**
	 * Test that a [Button] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsButtonParcelEquality() = assertEqualityAcrossParcelisation(Button())

	/**
	 * Test that a [Button] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteButtonParcelEquality() = assertEqualityAcrossParcelisation(ButtonTestData.COMPLETE_BUTTON)

	/**
	 * Test that a [Button] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsButtonBundleEquality() = assertEqualityAcrossBundleWriting(Button())

	/**
	 * Test that a [Button] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteButtonBundleEquality() = assertEqualityAcrossBundleWriting(ButtonTestData.COMPLETE_BUTTON)
}
