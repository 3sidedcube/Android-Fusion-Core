package com.cube.fusion.core.model.views

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossBundleWriting
import com.cube.fusion.core.ParcelTestUtils.assertEqualityAcrossParcelisation
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Suite of instrumented tests for ensuring [ListItem] class behaves as intended
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@RunWith(AndroidJUnit4::class) class ListItemInstrumentedTests {
	/**
	 * Test that a [ListItem] instance with no arguments remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testNoArgsListItemParcelEquality() = assertEqualityAcrossParcelisation(ListItem())

	/**
	 * Test that a [ListItem] instance with all properties specified remains the same after being parcelised and deparcelised
	 */
	@Test
	fun testCompleteListItemParcelEquality() = assertEqualityAcrossParcelisation(ListItemTestData.COMPLETE_LIST_ITEM)

	/**
	 * Test that a [ListItem] instance with no arguments remains the same after being written and read from a bundle
	 */
	@Test
	fun testNoArgsListItemBundleEquality() = assertEqualityAcrossBundleWriting(ListItem())

	/**
	 * Test that a [ListItem] instance with all properties specified remains the same after being written and read from a bundle
	 */
	@Test
	fun testCompleteListItemBundleEquality() = assertEqualityAcrossBundleWriting(ListItemTestData.COMPLETE_LIST_ITEM)
}
