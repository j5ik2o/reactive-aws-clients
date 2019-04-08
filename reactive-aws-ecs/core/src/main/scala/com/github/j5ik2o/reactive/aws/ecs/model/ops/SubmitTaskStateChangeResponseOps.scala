// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitTaskStateChangeResponseBuilderOps(val self: SubmitTaskStateChangeResponse.Builder) extends AnyVal {

  final def acknowledgmentAsScala(value: Option[String]): SubmitTaskStateChangeResponse.Builder = {
    value.fold(self) { v =>
      self.acknowledgment(v)
    }
  }

}

final class SubmitTaskStateChangeResponseOps(val self: SubmitTaskStateChangeResponse) extends AnyVal {

  final def acknowledgmentAsScala: Option[String] = Option(self.acknowledgment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitTaskStateChangeResponseOps {

  implicit def toSubmitTaskStateChangeResponseBuilderOps(
      v: SubmitTaskStateChangeResponse.Builder
  ): SubmitTaskStateChangeResponseBuilderOps = new SubmitTaskStateChangeResponseBuilderOps(v)

  implicit def toSubmitTaskStateChangeResponseOps(v: SubmitTaskStateChangeResponse): SubmitTaskStateChangeResponseOps =
    new SubmitTaskStateChangeResponseOps(v)

}
