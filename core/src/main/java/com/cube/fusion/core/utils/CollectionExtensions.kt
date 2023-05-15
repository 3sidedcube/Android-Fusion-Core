package com.cube.fusion.core.utils

import com.cube.fusion.core.resolver.ViewResolver
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

/**
 * Set of extension functions on Collection receivers relevant to the Core Fusion library
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object CollectionExtensions {
	/**
	 * Convenience method to get an [ObjectMapper] instance from a collection of [ViewResolver]s
	 *
	 * @return an [ObjectMapper] instance with all of the resolved view types registered
	 */
	fun Collection<ViewResolver>.objectMapper() = ObjectMapper().apply {
		this@objectMapper.forEach {
			registerSubtypes(it.resolveView())
		}
		disable(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)
	}
}