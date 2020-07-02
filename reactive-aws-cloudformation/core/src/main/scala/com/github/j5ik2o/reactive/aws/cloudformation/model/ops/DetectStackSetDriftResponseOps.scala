// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackSetDriftResponseBuilderOps(val self: DetectStackSetDriftResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): DetectStackSetDriftResponse.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

}

final class DetectStackSetDriftResponseOps(val self: DetectStackSetDriftResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackSetDriftResponseOps {

  implicit def toDetectStackSetDriftResponseBuilderOps(
      v: DetectStackSetDriftResponse.Builder
  ): DetectStackSetDriftResponseBuilderOps = new DetectStackSetDriftResponseBuilderOps(v)

  implicit def toDetectStackSetDriftResponseOps(v: DetectStackSetDriftResponse): DetectStackSetDriftResponseOps =
    new DetectStackSetDriftResponseOps(v)

}
