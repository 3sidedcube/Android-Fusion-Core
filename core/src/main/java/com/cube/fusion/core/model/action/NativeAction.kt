package com.cube.fusion.core.model.action

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.parcelize.Parcelize

/**
 * This class contains the data of an action that is handled natively with custom code
 *
 * Created by Nikos Rapousis on 25/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param link the unique identifier link of the action.
 *  Should be used by the developer to handle the link natively.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
class NativeAction @JsonCreator
constructor(@JsonProperty("link") var link: String? = null) : Action(), Parcelable {
	override fun extractClick(): String? {
		return link
	}
}