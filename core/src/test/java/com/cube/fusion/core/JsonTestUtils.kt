package com.cube.fusion.core

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
	 * Assert that an object is equal to the JSON deserialisation of its JSON data
	 *
	 * @param T The type of the object to deserialise.
	 * @param inObj The expected [T] that [inStr] should deserialise to.
	 * @param inStr The JSON representation of [inObj].
	 * @param resolvers The list of view resolvers to use for deserialisation, if necessary.
	 */
	inline fun <reified T> assertEqualityFromJsonDeserialisation(inObj: T, inStr: String, resolvers: List<ViewResolver>? = null)
	{
		val mapper = resolvers?.objectMapper() ?: ObjectMapper()
		val readObj = mapper.readValue(inStr, T::class.java)
		Assertions.assertThat(readObj).usingRecursiveComparison().isEqualTo(inObj)
	}
}
