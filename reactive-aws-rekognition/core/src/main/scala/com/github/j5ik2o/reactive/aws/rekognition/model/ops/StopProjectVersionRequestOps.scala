// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StopProjectVersionRequestBuilderOps(val self: StopProjectVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): StopProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.projectVersionArn(v)
    }
  }

}

final class StopProjectVersionRequestOps(val self: StopProjectVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopProjectVersionRequestOps {

  implicit def toStopProjectVersionRequestBuilderOps(
      v: StopProjectVersionRequest.Builder
  ): StopProjectVersionRequestBuilderOps = new StopProjectVersionRequestBuilderOps(v)

  implicit def toStopProjectVersionRequestOps(v: StopProjectVersionRequest): StopProjectVersionRequestOps =
    new StopProjectVersionRequestOps(v)

}
