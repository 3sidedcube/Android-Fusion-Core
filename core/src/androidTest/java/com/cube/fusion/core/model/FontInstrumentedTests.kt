package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Font] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class FontInstrumentedTests {
	/**
	 * Test that a [Font] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsFontParcelEquality() = assertEqualityAcrossParcelisation(Font())

	/**
	 * Test that a [Font] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteFontParcelEquality() = assertEqualityAcrossParcelisation(FontTestData.COMPLETE_FONT)

	/**
	 * Test that a [Font] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsFontBundleEquality() = assertEqualityAcrossBundleWriting(Font())

	/**
	 * Test that a [Font] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteFontBundleEquality() = assertEqualityAcrossBundleWriting(FontTestData.COMPLETE_FONT)
}
