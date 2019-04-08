// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportVolumeTaskDetailsBuilderOps(val self: ImportVolumeTaskDetails.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def bytesConvertedAsScala(value: Option[Long]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v =>
      self.bytesConverted(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def imageAsScala(value: Option[DiskImageDescription]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def volumeAsScala(value: Option[DiskImageVolumeDescription]): ImportVolumeTaskDetails.Builder = {
    value.fold(self) { v =>
      self.volume(v)
    }
  }

}

final class ImportVolumeTaskDetailsOps(val self: ImportVolumeTaskDetails) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def bytesConvertedAsScala: Option[Long] = Option(self.bytesConverted)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def imageAsScala: Option[DiskImageDescription] = Option(self.image)

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
