// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportVolumeRequestBuilderOps(val self: ImportVolumeRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ImportVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ImportVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def imageAsScala(value: Option[DiskImageDetail]): ImportVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def volumeAsScala(value: Option[VolumeDetail]): ImportVolumeRequest.Builder = {
    value.fold(self) { v =>
      self.volume(v)
    }
  }

}

final class ImportVolumeRequestOps(val self: ImportVolumeRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def imageAsScala: Option[DiskImageDetail] = Option(self.image)

  final def volumeAsScala: Option[VolumeDetail] = Option(self.volume)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportVolumeRequestOps {

  implicit def toImportVolumeRequestBuilderOps(v: ImportVolumeRequest.Builder): ImportVolumeRequestBuilderOps =
    new ImportVolumeRequestBuilderOps(v)

  implicit def toImportVolumeRequestOps(v: ImportVolumeRequest): ImportVolumeRequestOps = new ImportVolumeRequestOps(v)

}
