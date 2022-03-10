package com.cube.fusion.populator.coroutinesourcecache.cache

import com.cube.fusion.core.model.Page

/**
 * Abstract class representing a cache where Fusion [Page] data can be asynchronously retrieved from and stored using Kotlin Coroutines
 *
 * Created by JR Mitchell on 10/March/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
typealias FusionPageCache = FusionDataCache<Page>
