// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartProjectVersionRequestBuilderOps(val self: StartProjectVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): StartProjectVersionRequest.Builder = {
    value.fold(self) { v => self.projectVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minInferenceUnitsAsScala(value: Option[Int]): StartProjectVersionRequest.Builder = {
    value.fold(self) { v => self.minInferenceUnits(v) }
  }

}

final class StartProjectVersionRequestOps(val self: StartProjectVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minInferenceUnitsAsScala: Option[Int] = Option(self.minInferenceUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartProjectVersionRequestOps {

  implicit def toStartProjectVersionRequestBuilderOps(
      v: StartProjectVersionRequest.Builder
  ): StartProjectVersionRequestBuilderOps = new StartProjectVersionRequestBuilderOps(v)

  implicit def toStartProjectVersionRequestOps(v: StartProjectVersionRequest): StartProjectVersionRequestOps =
    new StartProjectVersionRequestOps(v)

}
