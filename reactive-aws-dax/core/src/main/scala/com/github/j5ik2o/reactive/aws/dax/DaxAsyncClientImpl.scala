package com.github.j5ik2o.reactive.aws.dax

import software.amazon.awssdk.services.dax.{ DaxAsyncClient => JavaDaxAsyncClient }

private[dax] class DaxAsyncClientImpl(override val underlying: JavaDaxAsyncClient) extends DaxAsyncClient
