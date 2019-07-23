// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceVolumeDetailItemBuilderOps(val self: ImportInstanceVolumeDetailItem.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesConvertedAsScala(value: Option[Long]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.bytesConverted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[DiskImageDescription]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeAsScala(value: Option[DiskImageVolumeDescription]): ImportInstanceVolumeDetailItem.Builder = {
    value.fold(self) { v =>
      self.volume(v)
    }
  }

}

final class ImportInstanceVolumeDetailItemOps(val self: ImportInstanceVolumeDetailItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bytesConvertedAsScala: Option[Long] = Option(self.bytesConverted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[DiskImageDescription] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeAsScala: Option[DiskImageVolumeDescription] = Option(self.volume)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceVolumeDetailItemOps {

  implicit def toImportInstanceVolumeDetailItemBuilderOps(
      v: ImportInstanceVolumeDetailItem.Builder
  ): ImportInstanceVolumeDetailItemBuilderOps = new ImportInstanceVolumeDetailItemBuilderOps(v)

  implicit def toImportInstanceVolumeDetailItemOps(
      v: ImportInstanceVolumeDetailItem
  ): ImportInstanceVolumeDetailItemOps = new ImportInstanceVolumeDetailItemOps(v)

}
