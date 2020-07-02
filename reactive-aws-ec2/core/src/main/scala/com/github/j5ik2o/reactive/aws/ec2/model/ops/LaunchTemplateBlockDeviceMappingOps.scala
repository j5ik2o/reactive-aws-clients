// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateBlockDeviceMappingBuilderOps(val self: LaunchTemplateBlockDeviceMapping.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): LaunchTemplateBlockDeviceMapping.Builder = {
    value.fold(self) { v => self.deviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala(value: Option[String]): LaunchTemplateBlockDeviceMapping.Builder = {
    value.fold(self) { v => self.virtualName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala(value: Option[LaunchTemplateEbsBlockDevice]): LaunchTemplateBlockDeviceMapping.Builder = {
    value.fold(self) { v => self.ebs(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala(value: Option[String]): LaunchTemplateBlockDeviceMapping.Builder = {
    value.fold(self) { v => self.noDevice(v) }
  }

}

final class LaunchTemplateBlockDeviceMappingOps(val self: LaunchTemplateBlockDeviceMapping) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala: Option[String] = Option(self.virtualName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala: Option[LaunchTemplateEbsBlockDevice] = Option(self.ebs)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala: Option[String] = Option(self.noDevice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateBlockDeviceMappingOps {

  implicit def toLaunchTemplateBlockDeviceMappingBuilderOps(
      v: LaunchTemplateBlockDeviceMapping.Builder
  ): LaunchTemplateBlockDeviceMappingBuilderOps = new LaunchTemplateBlockDeviceMappingBuilderOps(v)

  implicit def toLaunchTemplateBlockDeviceMappingOps(
      v: LaunchTemplateBlockDeviceMapping
  ): LaunchTemplateBlockDeviceMappingOps = new LaunchTemplateBlockDeviceMappingOps(v)

}
