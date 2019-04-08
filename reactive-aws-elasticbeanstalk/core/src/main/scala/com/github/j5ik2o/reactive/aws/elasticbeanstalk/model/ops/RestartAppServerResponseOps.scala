// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RestartAppServerResponseBuilderOps(val self: RestartAppServerResponse.Builder) extends AnyVal {}

final class RestartAppServerResponseOps(val self: RestartAppServerResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestartAppServerResponseOps {

  implicit def toRestartAppServerResponseBuilderOps(
      v: RestartAppServerResponse.Builder
  ): RestartAppServerResponseBuilderOps = new RestartAppServerResponseBuilderOps(v)

  implicit def toRestartAppServerResponseOps(v: RestartAppServerResponse): RestartAppServerResponseOps =
    new RestartAppServerResponseOps(v)

}
