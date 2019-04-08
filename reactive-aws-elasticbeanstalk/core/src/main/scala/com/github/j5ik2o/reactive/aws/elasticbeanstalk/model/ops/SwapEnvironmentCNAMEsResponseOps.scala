// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SwapEnvironmentCNAMEsResponseBuilderOps(val self: SwapEnvironmentCNAMEsResponse.Builder) extends AnyVal {}

final class SwapEnvironmentCNAMEsResponseOps(val self: SwapEnvironmentCNAMEsResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSwapEnvironmentCNAMEsResponseOps {

  implicit def toSwapEnvironmentCNAMEsResponseBuilderOps(
      v: SwapEnvironmentCNAMEsResponse.Builder
  ): SwapEnvironmentCNAMEsResponseBuilderOps = new SwapEnvironmentCNAMEsResponseBuilderOps(v)

  implicit def toSwapEnvironmentCNAMEsResponseOps(v: SwapEnvironmentCNAMEsResponse): SwapEnvironmentCNAMEsResponseOps =
    new SwapEnvironmentCNAMEsResponseOps(v)

}
