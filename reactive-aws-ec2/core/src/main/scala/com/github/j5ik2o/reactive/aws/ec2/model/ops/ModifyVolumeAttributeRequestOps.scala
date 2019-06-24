// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVolumeAttributeRequestBuilderOps(val self: ModifyVolumeAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoEnableIOAsScala(value: Option[AttributeBooleanValue]): ModifyVolumeAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.autoEnableIO(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala(value: Option[String]): ModifyVolumeAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.volumeId(v)
    }
  }

}

final class ModifyVolumeAttributeRequestOps(val self: ModifyVolumeAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoEnableIOAsScala: Option[AttributeBooleanValue] = Option(self.autoEnableIO)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdAsScala: Option[String] = Option(self.volumeId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVolumeAttributeRequestOps {

  implicit def toModifyVolumeAttributeRequestBuilderOps(
      v: ModifyVolumeAttributeRequest.Builder
  ): ModifyVolumeAttributeRequestBuilderOps = new ModifyVolumeAttributeRequestBuilderOps(v)

  implicit def toModifyVolumeAttributeRequestOps(v: ModifyVolumeAttributeRequest): ModifyVolumeAttributeRequestOps =
    new ModifyVolumeAttributeRequestOps(v)

}
