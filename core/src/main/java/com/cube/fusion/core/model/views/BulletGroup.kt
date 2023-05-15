package com.cube.fusion.core.model.views

import com.cube.fusion.core.model.Model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonUnwrapped
import kotlinx.parcelize.Parcelize

/**
 * Model representing the view for a group of bullet points, each of which is represented by a [Bullet]
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property children the list of [Bullet]s to display within the bullet group
 */
@Parcelize
@JsonIgnoreProperties(ignoreUnknown = true)
data class BulletGroup(
	val children: ArrayList<Bullet> = ArrayList(),
	@field:JsonUnwrapped val baseProperties: BaseViewProperties = BaseViewProperties()
) : Model()
