package com.cube.fusion.core.exception

/**
 * [Throwable] representing an unsuccessful API response (i.e one with a non-2xx response code)
 *
 * TODO: can we find a way to move this exception definition up to inheriting libs?
 *
 * Created by JR Mitchell on 04/January/2022.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class UnsuccessfulResponseError : Throwable()