package com.cube.fusion.core.model.action

/**
 * Object containing useful data for [EmailAction] test cases, for both JVM and instrumented tests
 *
 * Created by JR Mitchell on 04/January/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
object EmailActionTestData {

	/**
	 * The JSON data expected to parse to an instance of [EmailAction] constructed with no arguments
	 */
	val NO_ARGS_EMAIL_ACTION_JSON = """
		{
			"class": "EmailAction"
		}
	""".trimIndent()

	/**
	 * The JSON data expected to parse to an instance of [EmailAction] with every property specified as a non-default value
	 */
	val COMPLETE_EMAIL_ACTION_JSON = """
		{
			"class": "EmailAction",
			"to": ["fake1@email.com", "fake2@email.com"],
			"cc": ["fake3@email.com", "fake4@email.com"],
			"bcc": ["fake5@email.com", "fake6@email.com"],
			"subject": "Email Subject",
			"body": "To whom it may concern,\nThis is a test\nYours sincerely,\nJR"
		}
	""".trimIndent()

	/**
	 * An instance of [EmailAction] expected to match the parsed value of [COMPLETE_EMAIL_ACTION_JSON]
	 */
	val COMPLETE_EMAIL_ACTION = EmailAction(
		// TODO: Update EmailAction with a non-default constructor
	)
}
