package com.github.j5ik2o.reactive.aws.dax

import software.amazon.awssdk.services.dax.{ DaxClient => JavaDaxSyncClient }

private[dax] class DaxSyncClientImpl(override val underlying: JavaDaxSyncClient) extends DaxSyncClient
