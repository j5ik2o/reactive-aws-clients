// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class AbortEnvironmentUpdateResponseBuilderOps(val self: AbortEnvironmentUpdateResponse.Builder) extends AnyVal {}

final class AbortEnvironmentUpdateResponseOps(val self: AbortEnvironmentUpdateResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortEnvironmentUpdateResponseOps {

  implicit def toAbortEnvironmentUpdateResponseBuilderOps(
      v: AbortEnvironmentUpdateResponse.Builder
  ): AbortEnvironmentUpdateResponseBuilderOps = new AbortEnvironmentUpdateResponseBuilderOps(v)

  implicit def toAbortEnvironmentUpdateResponseOps(
      v: AbortEnvironmentUpdateResponse
  ): AbortEnvironmentUpdateResponseOps = new AbortEnvironmentUpdateResponseOps(v)

}
