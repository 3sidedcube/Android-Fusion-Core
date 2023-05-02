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
	 * @param model The model to pre-process
	 * @param ModelType The type of [model]
	 * @return An instance of [ModelType] created by chained application of the preprocessors in [this] in iteration order to [model]
	 */
	fun <ModelType> Collection<FusionDataPreprocessor<ModelType>>.preprocess(model: ModelType): ModelType {
		var outModel: ModelType = model
		forEach { processor ->
			outModel = processor.preprocess(outModel)
		}
		return outModel
	}

	/**
	 * Convenience method to execute a block of code on data after applying pre-processing
	 * The processing steps will be applied in order of iteration
	 *
	 * @param model The model to pre-process
	 * @param ModelType The type of [model]
	 * @param block The method to call with the pre-processed model as its argument
	 * @param ReturnType The return type of [block]
	 * @return The result of calling [block] on an instance of [ModelType] created by chained application of the preprocessors in [this] in iteration order to [model]
	 */
	inline fun <ModelType, ReturnType> Collection<FusionDataPreprocessor<ModelType>>.withPreprocessedData(model: ModelType, crossinline block: (ModelType) -> ReturnType) = preprocess(model).let(block)

	/**
	 * Convenience method to execute a block of code on nullable data after applying pre-processing
	 * The processing steps will be applied in order of iteration
	 *
	 * @param model The model to pre-process, or null
	 * @param ModelType The type of [model]
	 * @param block The method to call with the pre-processed model as its argument
	 * @param ReturnType The return type of [block]
	 * @return The result of calling [block] on an instance of [ModelType] created by chained application of the preprocessors in [this] in iteration order to [model].
	 *  If [model] is null, then this will simply be the result of calling [block] with a null argument.
	 */
	@JvmName("withPreprocessedNullableData")
	inline fun <ModelType, ReturnType> Collection<FusionDataPreprocessor<ModelType>>.withPreprocessedData(model: ModelType?, crossinline block: (ModelType?) -> ReturnType) = model?.let { preprocess(it) }.let(block)
}