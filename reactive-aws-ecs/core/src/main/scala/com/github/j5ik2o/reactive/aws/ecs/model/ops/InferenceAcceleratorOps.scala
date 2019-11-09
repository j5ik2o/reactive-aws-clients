// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class InferenceAcceleratorBuilderOps(val self: InferenceAccelerator.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): InferenceAccelerator.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceTypeAsScala(value: Option[String]): InferenceAccelerator.Builder = {
    value.fold(self) { v =>
      self.deviceType(v)
    }
  }

}

final class InferenceAcceleratorOps(val self: InferenceAccelerator) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceTypeAsScala: Option[String] = Option(self.deviceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInferenceAcceleratorOps {

  implicit def toInferenceAcceleratorBuilderOps(v: InferenceAccelerator.Builder): InferenceAcceleratorBuilderOps =
    new InferenceAcceleratorBuilderOps(v)

  implicit def toInferenceAcceleratorOps(v: InferenceAccelerator): InferenceAcceleratorOps =
    new InferenceAcceleratorOps(v)

}
