// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackResourceDriftResponseBuilderOps(val self: DetectStackResourceDriftResponse.Builder)
    extends AnyVal {

  final def stackResourceDriftAsScala(value: Option[StackResourceDrift]): DetectStackResourceDriftResponse.Builder = {
    value.fold(self) { v =>
      self.stackResourceDrift(v)
    }
  }

}

final class DetectStackResourceDriftResponseOps(val self: DetectStackResourceDriftResponse) extends AnyVal {

  final def stackResourceDriftAsScala: Option[StackResourceDrift] = Option(self.stackResourceDrift)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackResourceDriftResponseOps {

  implicit def toDetectStackResourceDriftResponseBuilderOps(
      v: DetectStackResourceDriftResponse.Builder
  ): DetectStackResourceDriftResponseBuilderOps = new DetectStackResourceDriftResponseBuilderOps(v)

  implicit def toDetectStackResourceDriftResponseOps(
      v: DetectStackResourceDriftResponse
  ): DetectStackResourceDriftResponseOps = new DetectStackResourceDriftResponseOps(v)

}
