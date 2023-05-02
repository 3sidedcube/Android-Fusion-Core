package com.cube.fusion.core

import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.core.utils.CollectionExtensions.objectMapper
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import org.assertj.core.api.Assertions

/**
 * Object containing utility methods for testing JSON serialisable classes
 *
 * Created by JR Mitchell on 27/April/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object JsonTestUtils {

	private class CustomPrettyPrinter: DefaultPrettyPrinter() {
		init {
			_arrayIndenter = DefaultIndenter("\t", "\n")
			_objectIndenter = DefaultIndenter("\t", "\n")
		}

		override fun createInstance(): DefaultPrettyPrinter {
			return CustomPrettyPrinter()
		}

		override fun writeObjectFieldValueSeparator(g: JsonGenerator?) {
			g?.writeRaw(": ")
		}
	}

	private val customPrettyPrinter by lazy {
		CustomPrettyPrinter()
	}

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

	/**
	 * Assert that an object correctly serialises to JSON
	 *
	 * @param T The type of the object to serialise.
	 * @param inObj The instance of [T] that should serialise to [inStr].
	 * @param inStr The JSON representation of [inObj].
	 * @param resolvers The list of view resolvers to use for serialisation, if necessary.
	 */
	fun <T> assertEqualityFromJsonSerialisation(inObj: T, inStr: String, resolvers: List<ViewResolver>? = null)
	{
		val mapper = resolvers?.objectMapper() ?: ObjectMapper().apply {
			disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)
		}
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
		mapper.setDefaultPrettyPrinter(customPrettyPrinter)
		mapper.enable(SerializationFeature.INDENT_OUTPUT)
		val writtenString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inObj)
		Assertions.assertThat(writtenString).isEqualTo(inStr)
	}
}
