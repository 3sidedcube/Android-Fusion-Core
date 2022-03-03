package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.parcelize.Parcelize

/**
 * Model representing the view for a group of bullet points, each of which is represented by a [Bullet]
 *
 * @property children the list of [Bullet]s to display within the bullet group
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 */
@Parcelize
@JsonIgnoreProperties(ignoreUnknown = true)
class BulletGroup : Model(), Parcelable {
	val children: ArrayList<Bullet> = ArrayList()
}