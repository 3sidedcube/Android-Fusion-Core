package com.cube.fusion.core.model

import android.os.Parcelable
import com.cube.fusion.core.model.views.Screen
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

/**
 * Representation of a single page of Fusion content
 *
 * Created by Nikos Rapousis on 24/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property class the class name of [Page] - used for JSON parsing
 * @property id the page's unique ID
 * @property slug identifying slug of the page
 * @property title the display title of the page
 * @property analyticsScreenView if relevant, the analytics screen event to send up when viewing this page
 * @property screen the screen of content to display in this page
 */
@Parcelize
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
class Page(
	val id: String = "",
	val slug: String = "",
	val title: String = "",
	@field:JsonProperty("analytics_screen_view") var analyticsScreenView: String? = null,
	var screen: Screen? = null
) : Parcelable {
	@IgnoredOnParcel val `class` = "Page"
}
