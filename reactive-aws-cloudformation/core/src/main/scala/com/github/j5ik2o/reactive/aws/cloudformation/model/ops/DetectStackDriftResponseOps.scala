// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackDriftResponseBuilderOps(val self: DetectStackDriftResponse.Builder) extends AnyVal {

  final def stackDriftDetectionIdAsScala(value: Option[String]): DetectStackDriftResponse.Builder = {
    value.fold(self) { v =>
      self.stackDriftDetectionId(v)
    }
  }

}

final class DetectStackDriftResponseOps(val self: DetectStackDriftResponse) extends AnyVal {

  final def stackDriftDetectionIdAsScala: Option[String] = Option(self.stackDriftDetectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackDriftResponseOps {

  implicit def toDetectStackDriftResponseBuilderOps(
      v: DetectStackDriftResponse.Builder
  ): DetectStackDriftResponseBuilderOps = new DetectStackDriftResponseBuilderOps(v)

  implicit def toDetectStackDriftResponseOps(v: DetectStackDriftResponse): DetectStackDriftResponseOps =
    new DetectStackDriftResponseOps(v)

}
