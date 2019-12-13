// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StopProjectVersionResponseBuilderOps(val self: StopProjectVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectVersionStatus]): StopProjectVersionResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class StopProjectVersionResponseOps(val self: StopProjectVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectVersionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopProjectVersionResponseOps {

  implicit def toStopProjectVersionResponseBuilderOps(
      v: StopProjectVersionResponse.Builder
  ): StopProjectVersionResponseBuilderOps = new StopProjectVersionResponseBuilderOps(v)

  implicit def toStopProjectVersionResponseOps(v: StopProjectVersionResponse): StopProjectVersionResponseOps =
    new StopProjectVersionResponseOps(v)

}
