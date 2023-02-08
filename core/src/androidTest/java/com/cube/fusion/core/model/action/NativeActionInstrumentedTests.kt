package com.cube.fusion.core.model.action

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [NativeAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class NativeActionInstrumentedTests {
	/**
	 * Test that a [NativeAction] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsNativeActionParcelEquality() = assertEqualityAcrossParcelisation(NativeAction())

	/**
	 * Test that a [NativeAction] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteNativeActionParcelEquality() = assertEqualityAcrossParcelisation(NativeActionTestData.COMPLETE_NATIVE_ACTION)

	/**
	 * Test that a [NativeAction] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsNativeActionBundleEquality() = assertEqualityAcrossBundleWriting(NativeAction())

	/**
	 * Test that a [NativeAction] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteNativeActionBundleEquality() = assertEqualityAcrossBundleWriting(NativeActionTestData.COMPLETE_NATIVE_ACTION)
}
