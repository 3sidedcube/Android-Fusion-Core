package com.cube.fusion.core

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import org.assertj.core.api.Assertions

/**
 * Object containing utility methods for testing [Parcelable] classes
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object ParcelTestUtils {
	/**
	 * Assert that an object remains unchanged when it is written to, and then read from, a [Parcel]
	 *
	 * @param T the type of the object to write to, then read from, a parcel
	 * @param inObj the object (of type [T]) to check=
	 */
	inline fun <reified T : Parcelable> assertEqualityAcrossParcelisation(inObj: T)
	{
		val parcel = Parcel.obtain()
		val readObj = try {
			parcel.writeParcelable(inObj, 0)
			parcel.setDataPosition(0)
			val read = parcel.readParcelable<T>(T::class.java.classLoader)
			read
		} finally {
			parcel.recycle()
		}
		Assertions.assertThat(readObj).usingRecursiveComparison().isEqualTo(inObj)
	}

	/**
	 * Assert that an object remains unchanged when it is written to, and then read from, a [Parcel]
	 * This implementation covers objects that are not [Parcelable], and so will always fail the assertion
	 * The test will automatically change to use the other method implementation when the object is updated to implement [Parcelable]
	 *
	 * @param T the type of the object to write to, then read from, a parcel
	 * @param inObj the object (of type [T]) to check
	 */
	inline fun <reified T> assertEqualityAcrossParcelisation(inObj: T)
	{
		throw AssertionError("${T::class.simpleName.orEmpty()} is not parcelable")
	}

	/**
	 * Assert that an object remains unchanged when it is written to, and then read from, a [Bundle]
	 *
	 * @param T the type of the object to write to, then read from, a bundle
	 * @param inObj the object (of type [T]) to check
	 */
	inline fun <reified T : Parcelable> assertEqualityAcrossBundleWriting(inObj: T)
	{
		val key = "DATA"
		val bundle = Bundle()
		bundle.putParcelable(key, inObj)
		val readObj = bundle.getParcelable<T>(key)
		Assertions.assertThat(readObj).usingRecursiveComparison().isEqualTo(inObj)
	}

	/**
	 * Assert that an object remains unchanged when it is written to, and then read from, a [Bundle]
	 * This implementation covers objects that are not [Parcelable], and so will always fail the assertion
	 * The test will automatically change to use the other method implementation when the object is updated to implement [Parcelable]
	 *
	 * @param T the type of the object to write to, then read from, a bundle
	 * @param inObj the object (of type [T]) to check
	 */
	inline fun <reified T> assertEqualityAcrossBundleWriting(inObj: T)
	{
		throw AssertionError("${T::class.simpleName.orEmpty()} is not parcelable")
	}
}
