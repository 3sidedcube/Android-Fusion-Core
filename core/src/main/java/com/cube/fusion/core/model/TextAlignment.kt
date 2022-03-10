package com.cube.fusion.core.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Enum class representing the different alignments for text
 *
 * Created by Nikos Rapousis on 10/March/2021.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @property START aligned to the start of the view
 * @property CENTER centered within the view
 * @property END aligned to the end of the view
 * @property JUSTIFIED justified
 */
enum class TextAlignment {
	@JsonProperty("left")
	START,

	@JsonProperty("center")
	CENTER,

	@JsonProperty("right")
	END,

	@JsonProperty("justified")
	JUSTIFIED;
}