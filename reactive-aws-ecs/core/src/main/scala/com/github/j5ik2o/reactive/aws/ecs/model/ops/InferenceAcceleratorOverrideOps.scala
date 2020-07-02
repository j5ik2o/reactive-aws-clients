// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class InferenceAcceleratorOverrideBuilderOps(val self: InferenceAcceleratorOverride.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): InferenceAcceleratorOverride.Builder = {
    value.fold(self) { v => self.deviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceTypeAsScala(value: Option[String]): InferenceAcceleratorOverride.Builder = {
    value.fold(self) { v => self.deviceType(v) }
  }

}

final class InferenceAcceleratorOverrideOps(val self: InferenceAcceleratorOverride) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceTypeAsScala: Option[String] = Option(self.deviceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInferenceAcceleratorOverrideOps {

  implicit def toInferenceAcceleratorOverrideBuilderOps(
      v: InferenceAcceleratorOverride.Builder
  ): InferenceAcceleratorOverrideBuilderOps = new InferenceAcceleratorOverrideBuilderOps(v)

  implicit def toInferenceAcceleratorOverrideOps(v: InferenceAcceleratorOverride): InferenceAcceleratorOverrideOps =
    new InferenceAcceleratorOverrideOps(v)

}
