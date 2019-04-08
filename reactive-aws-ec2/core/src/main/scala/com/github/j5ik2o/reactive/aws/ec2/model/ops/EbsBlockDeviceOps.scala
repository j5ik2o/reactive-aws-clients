// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EbsBlockDeviceBuilderOps(val self: EbsBlockDevice.Builder) extends AnyVal {

  final def deleteOnTerminationAsScala(value: Option[Boolean]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def volumeSizeAsScala(value: Option[Int]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  final def volumeTypeAsScala(value: Option[VolumeType]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

  final def encryptedAsScala(value: Option[Boolean]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): EbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

}

final class EbsBlockDeviceOps(val self: EbsBlockDevice) extends AnyVal {

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def iopsAsScala: Option[Int] = Option(self.iops)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEbsBlockDeviceOps {

  implicit def toEbsBlockDeviceBuilderOps(v: EbsBlockDevice.Builder): EbsBlockDeviceBuilderOps =
    new EbsBlockDeviceBuilderOps(v)

  implicit def toEbsBlockDeviceOps(v: EbsBlockDevice): EbsBlockDeviceOps = new EbsBlockDeviceOps(v)

}
