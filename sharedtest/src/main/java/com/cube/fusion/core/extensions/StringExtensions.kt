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
	fun String.trimJsonContainer() = this.trimStart(' ', '\t', '\n', '{').trimEnd(' ', '\t', '\n').trimEnd('}').trimEnd('\n')

	/**
	 * Removes the class from this JSON-formatted [String]
	 */
	fun String.withoutClass() = this.replace(Regex("\"class\": \"[a-zA-Z]+\","), "")

	/**
	 * Indents all but the first line of the JSON data by a given amount.
	 * @param tabs The number of tabs to indent by.
	 */
	fun String.tabIndented(tabs: Int): String {
		val indent = "\t".repeat(tabs)
		return this.prependIndent(indent).removePrefix(indent)
	}
}
