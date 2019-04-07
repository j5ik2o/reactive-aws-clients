package com.github.j5ik2o.reactive.aws.dax.cats

import com.github.j5ik2o.reactive.aws.dax.DaxAsyncClient

private[dax] class DaxCatsIOClientImpl(override val underlying: DaxAsyncClient) extends DaxCatsIOClient
