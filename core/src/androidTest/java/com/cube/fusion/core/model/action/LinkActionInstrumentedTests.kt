package com.cube.fusion.core.model.action

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [LinkAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class LinkActionInstrumentedTests {
	/**
	 * Test that a [LinkAction] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsLinkActionParcelEquality() = assertEqualityAcrossParcelisation(LinkAction())

	/**
	 * Test that a [LinkAction] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteLinkActionParcelEquality() = assertEqualityAcrossParcelisation(LinkActionTestData.COMPLETE_LINK_ACTION)

	/**
	 * Test that a [LinkAction] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsLinkActionBundleEquality() = assertEqualityAcrossBundleWriting(LinkAction())

	/**
	 * Test that a [LinkAction] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteLinkActionBundleEquality() = assertEqualityAcrossBundleWriting(LinkActionTestData.COMPLETE_LINK_ACTION)
}
