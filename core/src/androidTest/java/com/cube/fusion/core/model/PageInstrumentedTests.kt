package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [Page] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class PageInstrumentedTests {
	/**
	 * Test that a [Page] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsPageParcelEquality() = assertEqualityAcrossParcelisation(Page())

	/**
	 * Test that a [Page] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompletePageParcelEquality() = assertEqualityAcrossParcelisation(PageTestData.COMPLETE_PAGE)

	/**
	 * Test that a [Page] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsPageBundleEquality() = assertEqualityAcrossBundleWriting(Page())

	/**
	 * Test that a [Page] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompletePageBundleEquality() = assertEqualityAcrossBundleWriting(PageTestData.COMPLETE_PAGE)
}
