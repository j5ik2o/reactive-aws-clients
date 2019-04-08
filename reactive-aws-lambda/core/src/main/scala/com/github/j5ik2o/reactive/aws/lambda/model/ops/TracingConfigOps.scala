// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class TracingConfigBuilderOps(val self: TracingConfig.Builder) extends AnyVal {

  final def modeAsScala(value: Option[TracingMode]): TracingConfig.Builder = {
    value.fold(self) { v =>
      self.mode(v)
    }
  }

}

final class TracingConfigOps(val self: TracingConfig) extends AnyVal {

  final def modeAsScala: Option[TracingMode] = Option(self.mode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTracingConfigOps {

  implicit def toTracingConfigBuilderOps(v: TracingConfig.Builder): TracingConfigBuilderOps =
    new TracingConfigBuilderOps(v)

  implicit def toTracingConfigOps(v: TracingConfig): TracingConfigOps = new TracingConfigOps(v)

}
