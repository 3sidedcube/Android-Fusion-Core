package com.cube.fusion.core.model.action

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [PageAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class PageActionInstrumentedTests {
	/**
	 * Test that a [PageAction] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsPageActionParcelEquality() = assertEqualityAcrossParcelisation(PageAction())

	/**
	 * Test that a [PageAction] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompletePageActionParcelEquality() = assertEqualityAcrossParcelisation(PageActionTestData.COMPLETE_PAGE_ACTION)

	/**
	 * Test that a [PageAction] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsPageActionBundleEquality() = assertEqualityAcrossBundleWriting(PageAction())

	/**
	 * Test that a [PageAction] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompletePageActionBundleEquality() = assertEqualityAcrossBundleWriting(PageActionTestData.COMPLETE_PAGE_ACTION)
}
