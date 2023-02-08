package com.cube.fusion.core.extensions

/**
 * Object containing extension methods on receivers of type [String]
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object StringExtensions {
	/**
	 * Trims the outer curly brackets and any whitespace from this JSON-formatted [String]
	 */
	fun String.trimJsonContainer() = this.trimStart(' ', '\t', '\n', '{').trimEnd(' ', '\t', '\n').trimEnd('}')
}
