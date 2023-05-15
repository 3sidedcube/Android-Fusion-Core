package com.cube.fusion.core.processor

/**
 * Convenience [FusionDataPreprocessor] implementation for applying multiple pre-processing steps in order
 *
 * Created by JR Mitchell on 15/May/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param T The type of the data that this pre-processes
 * @param preprocessors The list of preprocessors to execute, in order, when pre-processing data of type [T]
 */
class FusionMultiPreprocessor<T>(private val preprocessors: MutableList<FusionDataPreprocessor<T>> = mutableListOf()): FusionDataPreprocessor<T>, MutableList<FusionDataPreprocessor<T>> by preprocessors {
	override fun preprocess(data: T): T {
		var output = data
		preprocessors.forEach {
			output = it.preprocess(output)
		}
		return output
	}

	companion object {
		/**
		 * Convenience method to construct a [FusionMultiPreprocessor] from a number of [FusionDataPreprocessor]s
		 * @param T The type of the data that the resulting [FusionMultiPreprocessor] pre-processes
		 * @param preprocessors The list of preprocessors to execute, in order, when pre-processing data of type [T]
		 * @return A [FusionMultiPreprocessor] that uses the [preprocessors] provided to this method
		 */
		fun <T> multiPreprocessorOf(vararg preprocessors: FusionDataPreprocessor<T>) = FusionMultiPreprocessor(mutableListOf(*preprocessors))

		/**
		 * Convenience method to construct a [FusionMultiPreprocessor] from this list of [FusionDataPreprocessor]s
		 * @param T The type of the data that the resulting [FusionMultiPreprocessor] pre-processes
		 * @return A [FusionMultiPreprocessor] that executes the preprocessors in [this] in order when pre-processing data of type [T]
		 */
		fun <T> List<FusionDataPreprocessor<T>>.toMultiPreprocessor() = FusionMultiPreprocessor(toMutableList())
	}
}
