package com.cube.fusion.core.model

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.Parcelize

/**
 * Representation of a link to a Fusion page
 *
 * Created by Nikos Rapousis on 12/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property id the ID of the page to link to
 * @property title the title of the page to link to
 * @property apiUrl the URL of the page to link to
 */

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
class UrlLink (
	val id: String? = null,
	val title: String? = null,
	val apiUrl: String? = null
) : Parcelable
