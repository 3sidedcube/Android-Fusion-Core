package com.cube.fusion.core.model.action

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import kotlinx.parcelize.IgnoredOnParcel

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "class")
@JsonSubTypes(
	JsonSubTypes.Type(value = NativeAction::class, name = "NativeAction"),
	JsonSubTypes.Type(value = LinkAction::class, name = "LinkAction"),
	JsonSubTypes.Type(value = PageAction::class, name = "PageAction"),
	JsonSubTypes.Type(value = EmailAction::class, name = "EmailAction")
)
/**
 * Interface representing an action to be associated with the click handling of a clickable view
 *
 * Created by Nikos Rapousis on 12/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property class the class name of the action - used for JSON parsing
 */
abstract class Action : Parcelable {
	@IgnoredOnParcel open val `class`: String = javaClass.simpleName

	abstract fun extractClick(): String?
}