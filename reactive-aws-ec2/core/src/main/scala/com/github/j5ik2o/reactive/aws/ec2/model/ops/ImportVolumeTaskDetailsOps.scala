// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportVolumeTaskDetailsBuilderOps(val self: ImportVolumeTaskDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesConvertedAsScala(value: Option[Long]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v => self.bytesConverted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[DiskImageDescription]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeAsScala(value: Option[DiskImageVolumeDescription]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v => self.volume(v) }
  }

}

final class ImportVolumeTaskDetailsOps(val self: ImportVolumeTaskDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesConvertedAsScala: Option[Long] = Option(self.bytesConverted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[DiskImageDescription] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeAsScala: Option[DiskImageVolumeDescription] = Option(self.volume)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportVolumeTaskDetailsOps {

  implicit def toImportVolumeTaskDetailsBuilderOps(
      v: ImportVolumeTaskDetails.Builder
  ): ImportVolumeTaskDetailsBuilderOps = new ImportVolumeTaskDetailsBuilderOps(v)

  implicit def toImportVolumeTaskDetailsOps(v: ImportVolumeTaskDetails): ImportVolumeTaskDetailsOps =
    new ImportVolumeTaskDetailsOps(v)

}
