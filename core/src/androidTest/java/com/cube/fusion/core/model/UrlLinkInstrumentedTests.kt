package com.cube.fusion.core.model

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [UrlLink] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class UrlLinkInstrumentedTests {
	/**
	 * Test that a [UrlLink] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsUrlLinkParcelEquality() = assertEqualityAcrossParcelisation(UrlLink())

	/**
	 * Test that a [UrlLink] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteUrlLinkParcelEquality() = assertEqualityAcrossParcelisation(UrlLinkTestData.COMPLETE_URL_LINK)

	/**
	 * Test that a [UrlLink] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsUrlLinkBundleEquality() = assertEqualityAcrossBundleWriting(UrlLink())

	/**
	 * Test that a [UrlLink] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteUrlLinkBundleEquality() = assertEqualityAcrossBundleWriting(UrlLinkTestData.COMPLETE_URL_LINK)
}
