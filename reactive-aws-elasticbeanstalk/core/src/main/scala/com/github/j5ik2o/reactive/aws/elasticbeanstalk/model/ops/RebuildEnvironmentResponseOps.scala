// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RebuildEnvironmentResponseBuilderOps(val self: RebuildEnvironmentResponse.Builder) extends AnyVal {}

final class RebuildEnvironmentResponseOps(val self: RebuildEnvironmentResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRebuildEnvironmentResponseOps {

  implicit def toRebuildEnvironmentResponseBuilderOps(
      v: RebuildEnvironmentResponse.Builder
  ): RebuildEnvironmentResponseBuilderOps = new RebuildEnvironmentResponseBuilderOps(v)

  implicit def toRebuildEnvironmentResponseOps(v: RebuildEnvironmentResponse): RebuildEnvironmentResponseOps =
    new RebuildEnvironmentResponseOps(v)

}
