package com.cube.fusion.core.model.action

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * This class contains the data for an action that is handled as an email
 *
 * Created by Nikos Rapousis on 25/November/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property to who the email is sent to
 * @property cc who the email is carbon copied to
 * @property bcc who the email is blind carbon copied to
 * @property subject the subject line of the email
 * @property body the body content of the email
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class EmailAction : Action() {
	val to: ArrayList<String>? = null
	val cc: ArrayList<String>? = null
	val bcc: ArrayList<String>? = null
	val subject: String? = null
	val body: String? = null

	override fun extractClick(): String? {
		return null
	}
}