package com.github.j5ik2o.reactive.aws.dax.monix

import com.github.j5ik2o.reactive.aws.dax.DaxAsyncClient

private[dax] class DaxMonixClientImpl(override val underlying: DaxAsyncClient) extends DaxMonixClient
