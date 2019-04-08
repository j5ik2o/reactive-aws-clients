// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RequestEnvironmentInfoResponseBuilderOps(val self: RequestEnvironmentInfoResponse.Builder) extends AnyVal {}

final class RequestEnvironmentInfoResponseOps(val self: RequestEnvironmentInfoResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestEnvironmentInfoResponseOps {

  implicit def toRequestEnvironmentInfoResponseBuilderOps(
      v: RequestEnvironmentInfoResponse.Builder
  ): RequestEnvironmentInfoResponseBuilderOps = new RequestEnvironmentInfoResponseBuilderOps(v)

  implicit def toRequestEnvironmentInfoResponseOps(
      v: RequestEnvironmentInfoResponse
  ): RequestEnvironmentInfoResponseOps = new RequestEnvironmentInfoResponseOps(v)

}
