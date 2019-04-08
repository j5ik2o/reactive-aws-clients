// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateEbsBlockDeviceBuilderOps(val self: LaunchTemplateEbsBlockDevice.Builder) extends AnyVal {

  final def encryptedAsScala(value: Option[Boolean]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def iopsAsScala(value: Option[Int]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

  final def kmsKeyIdAsScala(value: Option[String]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  final def snapshotIdAsScala(value: Option[String]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  final def volumeSizeAsScala(value: Option[Int]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  final def volumeTypeAsScala(value: Option[VolumeType]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

}

final class LaunchTemplateEbsBlockDeviceOps(val self: LaunchTemplateEbsBlockDevice) extends AnyVal {

  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def iopsAsScala: Option[Int] = Option(self.iops)

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateEbsBlockDeviceOps {

  implicit def toLaunchTemplateEbsBlockDeviceBuilderOps(
      v: LaunchTemplateEbsBlockDevice.Builder
  ): LaunchTemplateEbsBlockDeviceBuilderOps = new LaunchTemplateEbsBlockDeviceBuilderOps(v)

  implicit def toLaunchTemplateEbsBlockDeviceOps(v: LaunchTemplateEbsBlockDevice): LaunchTemplateEbsBlockDeviceOps =
    new LaunchTemplateEbsBlockDeviceOps(v)

}
