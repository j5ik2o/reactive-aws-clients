// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DiskImageVolumeDescriptionBuilderOps(val self: DiskImageVolumeDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): DiskImageVolumeDescription.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala(value: Option[Long]): DiskImageVolumeDescription.Builder = {
    value.fold(self) { v => self.size(v) }
  }

}

final class DiskImageVolumeDescriptionOps(val self: DiskImageVolumeDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeAsScala: Option[Long] = Option(self.size)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiskImageVolumeDescriptionOps {

  implicit def toDiskImageVolumeDescriptionBuilderOps(
      v: DiskImageVolumeDescription.Builder
  ): DiskImageVolumeDescriptionBuilderOps = new DiskImageVolumeDescriptionBuilderOps(v)

  implicit def toDiskImageVolumeDescriptionOps(v: DiskImageVolumeDescription): DiskImageVolumeDescriptionOps =
    new DiskImageVolumeDescriptionOps(v)

}
