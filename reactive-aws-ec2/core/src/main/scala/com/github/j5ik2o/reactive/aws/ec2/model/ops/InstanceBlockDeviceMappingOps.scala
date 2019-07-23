// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceBlockDeviceMappingBuilderOps(val self: InstanceBlockDeviceMapping.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): InstanceBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala(value: Option[EbsInstanceBlockDevice]): InstanceBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.ebs(v)
    }
  }

}

final class InstanceBlockDeviceMappingOps(val self: InstanceBlockDeviceMapping) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala: Option[EbsInstanceBlockDevice] = Option(self.ebs)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceBlockDeviceMappingOps {

  implicit def toInstanceBlockDeviceMappingBuilderOps(
      v: InstanceBlockDeviceMapping.Builder
  ): InstanceBlockDeviceMappingBuilderOps = new InstanceBlockDeviceMappingBuilderOps(v)

  implicit def toInstanceBlockDeviceMappingOps(v: InstanceBlockDeviceMapping): InstanceBlockDeviceMappingOps =
    new InstanceBlockDeviceMappingOps(v)

}
