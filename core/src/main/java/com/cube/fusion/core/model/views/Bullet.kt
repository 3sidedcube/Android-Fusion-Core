package com.cube.fusion.core.model.views

import android.os.Parcelable
import com.cube.fusion.core.model.Model
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.parcelize.Parcelize

/**
 * Model representing a single bullet item view within a [BulletGroup]
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property title the title text for the bullet view
 * @property subtitle the subtitle text for the bullet view
 * @property order the numerical index of the bullet
 */
@Parcelize
@JsonIgnoreProperties(ignoreUnknown = true)
class Bullet : Model(), Parcelable {
	val title: Text? = null
	val subtitle: Text? = null
	var order: Int = 0
}
