package com.cube.fusion.populator.retrofit.source

import com.cube.fusion.core.model.Page
import com.cube.fusion.core.resolver.ViewResolver
import com.cube.fusion.populator.coroutinesourcecache.source.FusionDataSource

/**
 * [FusionDataSource] implementation which fetches the [Page] data from an API endpoint using Retrofit
 *
 * Created by JR Mitchell on 10/March/2020.
 * Copyright ® 3SidedCube. All rights reserved.
 *
 * @param baseUrl the base URL of the API
 * @param resolvers a collection of [ViewResolver]s for all of the views that need to be parsed
 */
class RetrofitPageSource(baseUrl: String, resolvers: Collection<ViewResolver>) : RetrofitDataSource<Page>(baseUrl, resolvers, Page::class.java)