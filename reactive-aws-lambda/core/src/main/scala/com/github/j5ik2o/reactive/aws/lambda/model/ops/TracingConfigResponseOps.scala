// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class TracingConfigResponseBuilderOps(val self: TracingConfigResponse.Builder) extends AnyVal {

  final def modeAsScala(value: Option[TracingMode]): TracingConfigResponse.Builder = {
    value.fold(self) { v =>
      self.mode(v)
    }
  } // TracingMode

}

final class TracingConfigResponseOps(val self: TracingConfigResponse) extends AnyVal {

  final def modeAsScala: Option[TracingMode] = Option(self.mode) // TracingMode

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTracingConfigResponseOps {

  implicit def toTracingConfigResponseBuilderOps(v: TracingConfigResponse.Builder): TracingConfigResponseBuilderOps =
    new TracingConfigResponseBuilderOps(v)

  implicit def toTracingConfigResponseOps(v: TracingConfigResponse): TracingConfigResponseOps =
    new TracingConfigResponseOps(v)

}
