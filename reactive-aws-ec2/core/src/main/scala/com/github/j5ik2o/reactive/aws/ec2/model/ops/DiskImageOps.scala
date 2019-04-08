// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DiskImageBuilderOps(val self: DiskImage.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): DiskImage.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def imageAsScala(value: Option[DiskImageDetail]): DiskImage.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def volumeAsScala(value: Option[VolumeDetail]): DiskImage.Builder = {
    value.fold(self) { v =>
      self.volume(v)
    }
  }

}

final class DiskImageOps(val self: DiskImage) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def imageAsScala: Option[DiskImageDetail] = Option(self.image)

  final def volumeAsScala: Option[VolumeDetail] = Option(self.volume)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDiskImageOps {

  implicit def toDiskImageBuilderOps(v: DiskImage.Builder): DiskImageBuilderOps = new DiskImageBuilderOps(v)

  implicit def toDiskImageOps(v: DiskImage): DiskImageOps = new DiskImageOps(v)

}
