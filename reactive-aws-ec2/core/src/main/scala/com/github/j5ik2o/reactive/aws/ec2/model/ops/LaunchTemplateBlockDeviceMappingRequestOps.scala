// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateBlockDeviceMappingRequestBuilderOps(val self: LaunchTemplateBlockDeviceMappingRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): LaunchTemplateBlockDeviceMappingRequest.Builder = {
    value.fold(self) { v => self.deviceName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala(value: Option[String]): LaunchTemplateBlockDeviceMappingRequest.Builder = {
    value.fold(self) { v => self.virtualName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala(
      value: Option[LaunchTemplateEbsBlockDeviceRequest]
  ): LaunchTemplateBlockDeviceMappingRequest.Builder = {
    value.fold(self) { v => self.ebs(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala(value: Option[String]): LaunchTemplateBlockDeviceMappingRequest.Builder = {
    value.fold(self) { v => self.noDevice(v) }
  }

}

final class LaunchTemplateBlockDeviceMappingRequestOps(val self: LaunchTemplateBlockDeviceMappingRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala: Option[String] = Option(self.virtualName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala: Option[LaunchTemplateEbsBlockDeviceRequest] = Option(self.ebs)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala: Option[String] = Option(self.noDevice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateBlockDeviceMappingRequestOps {

  implicit def toLaunchTemplateBlockDeviceMappingRequestBuilderOps(
      v: LaunchTemplateBlockDeviceMappingRequest.Builder
  ): LaunchTemplateBlockDeviceMappingRequestBuilderOps = new LaunchTemplateBlockDeviceMappingRequestBuilderOps(v)

  implicit def toLaunchTemplateBlockDeviceMappingRequestOps(
      v: LaunchTemplateBlockDeviceMappingRequest
  ): LaunchTemplateBlockDeviceMappingRequestOps = new LaunchTemplateBlockDeviceMappingRequestOps(v)

}
