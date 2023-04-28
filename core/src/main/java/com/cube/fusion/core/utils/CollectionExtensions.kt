package com.cube.fusion.core.utils

import com.cube.fusion.core.processor.FusionDataPreprocessor
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

	/**
	 * Convenience method to preprocess a model with a series of preprocessors
	 * The processing steps will be applied in order of iteration
	 *
	 * @param model The model to preprocessing
	 * @param T The type of [model]
	 * @return An instance of [T] created by chained application of the preprocessors in [this] in iteration order to [model]
	 */
	fun <T> Collection<FusionDataPreprocessor<T>>.preprocess(model: T): T {
		var outModel: T = model
		forEach { processor ->
			outModel = processor.preprocess(outModel)
		}
		return outModel
	}
}