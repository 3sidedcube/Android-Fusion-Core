package com.cube.fusion.core.model.action

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [EmailAction] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class EmailActionInstrumentedTests {
	/**
	 * Test that a [EmailAction] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsEmailActionParcelEquality() = assertEqualityAcrossParcelisation(EmailAction())

	/**
	 * Test that a [EmailAction] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteEmailActionParcelEquality() = assertEqualityAcrossParcelisation(EmailActionTestData.COMPLETE_EMAIL_ACTION)

	/**
	 * Test that a [EmailAction] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsEmailActionBundleEquality() = assertEqualityAcrossBundleWriting(EmailAction())

	/**
	 * Test that a [EmailAction] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteEmailActionBundleEquality() = assertEqualityAcrossBundleWriting(EmailActionTestData.COMPLETE_EMAIL_ACTION)
}
