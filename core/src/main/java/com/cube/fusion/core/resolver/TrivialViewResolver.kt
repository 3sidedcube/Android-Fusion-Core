package com.cube.fusion.core.resolver

import com.cube.fusion.core.model.Model

/**
 * Trivial implementation of [ViewResolver] which returns a predefined class in [resolveView]
 * @param clazz The class to resolve to
 */
class TrivialViewResolver(private val clazz: Class<out Model>) : ViewResolver {
	override fun resolveView(): Class<out Model?> = clazz
}
