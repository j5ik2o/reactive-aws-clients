package com.github.j5ik2o.reactive.aws.dax.akka

import com.github.j5ik2o.reactive.aws.dax.DaxAsyncClient

private[dax] class DaxAkkaClientImpl(override val underlying: DaxAsyncClient) extends DaxAkkaClient
