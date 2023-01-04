package com.cube.fusion.core

import com.cube.fusion.core.model.Model
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.objectMapper
import com.fasterxml.jackson.databind.ObjectMapper
import org.assertj.core.api.Assertions

/**
 * Object containing utility methods for testing JSON serialisable classes
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object JsonTestUtils {
	/**
	 * Assert that a [Model] is equal to the JSON deserialisation of its JSON data
	 *
	 * @param T the type of the object to deserialise
	 * @param inObj the expected [T] that [inStr] should deserialise to
	 * @param inStr the JSON representation of [inObj]
	 */
	inline fun <reified T : Model> assertEqualityFromResolvedJsonDeserialisation(inObj: T, inStr: String)
	{
		val resolver = object : ViewResolver {
			override fun resolveView(): Class<out Model?> = T::class.java
		}
		val readObj = listOf(resolver).objectMapper().readValue(inStr, T::class.java)
		Assertions.assertThat(readObj).usingRecursiveComparison().isEqualTo(inObj)
	}

	/**
	 * Assert that a non-[Model] object is equal to the JSON deserialisation of its JSON data
	 *
	 * @param T the type of the object to deserialise
	 * @param inObj the expected [T] that [inStr] should deserialise to
	 * @param inStr the JSON representation of [inObj]
	 */
	inline fun <reified T> assertEqualityFromJsonDeserialisation(inObj: T, inStr: String)
	{
		val readObj = ObjectMapper().readValue(inStr, T::class.java)
		Assertions.assertThat(readObj).usingRecursiveComparison().isEqualTo(inObj)
	}
}
