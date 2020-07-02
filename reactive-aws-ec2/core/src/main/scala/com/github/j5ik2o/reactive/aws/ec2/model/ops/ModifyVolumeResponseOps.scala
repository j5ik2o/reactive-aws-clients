// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVolumeResponseBuilderOps(val self: ModifyVolumeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeModificationAsScala(value: Option[VolumeModification]): ModifyVolumeResponse.Builder = {
    value.fold(self) { v => self.volumeModification(v) }
  }

}

final class ModifyVolumeResponseOps(val self: ModifyVolumeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeModificationAsScala: Option[VolumeModification] = Option(self.volumeModification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVolumeResponseOps {

  implicit def toModifyVolumeResponseBuilderOps(v: ModifyVolumeResponse.Builder): ModifyVolumeResponseBuilderOps =
    new ModifyVolumeResponseBuilderOps(v)

  implicit def toModifyVolumeResponseOps(v: ModifyVolumeResponse): ModifyVolumeResponseOps =
    new ModifyVolumeResponseOps(v)

}
