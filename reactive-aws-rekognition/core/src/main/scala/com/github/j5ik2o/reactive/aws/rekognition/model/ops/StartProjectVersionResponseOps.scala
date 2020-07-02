// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartProjectVersionResponseBuilderOps(val self: StartProjectVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectVersionStatus]): StartProjectVersionResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class StartProjectVersionResponseOps(val self: StartProjectVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectVersionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartProjectVersionResponseOps {

  implicit def toStartProjectVersionResponseBuilderOps(
      v: StartProjectVersionResponse.Builder
  ): StartProjectVersionResponseBuilderOps = new StartProjectVersionResponseBuilderOps(v)

  implicit def toStartProjectVersionResponseOps(v: StartProjectVersionResponse): StartProjectVersionResponseOps =
    new StartProjectVersionResponseOps(v)

}
