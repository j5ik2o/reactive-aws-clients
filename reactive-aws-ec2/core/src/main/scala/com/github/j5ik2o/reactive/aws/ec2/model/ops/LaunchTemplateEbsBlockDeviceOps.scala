// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateEbsBlockDeviceBuilderOps(val self: LaunchTemplateEbsBlockDevice.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.encrypted(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(value: Option[Boolean]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.deleteOnTermination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala(value: Option[Int]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.iops(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.snapshotId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala(value: Option[Int]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.volumeSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeTypeAsScala(value: Option[VolumeType]): LaunchTemplateEbsBlockDevice.Builder = {
    value.fold(self) { v => self.volumeType(v) }
  }

}

final class LaunchTemplateEbsBlockDeviceOps(val self: LaunchTemplateEbsBlockDevice) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala: Option[Int] = Option(self.iops)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
