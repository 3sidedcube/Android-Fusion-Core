package com.cube.fusion.populator.coroutinesourcecache.source

import com.cube.fusion.core.model.Page

/**
 * Abstract class representing a source where Fusion [Page] data can be asynchronously retrieved from using Kotlin Coroutines
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
typealias FusionPageSource = FusionDataSource<Page>