// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceBlockDeviceMappingSpecificationBuilderOps(val self: InstanceBlockDeviceMappingSpecification.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): InstanceBlockDeviceMappingSpecification.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala(
      value: Option[EbsInstanceBlockDeviceSpecification]
  ): InstanceBlockDeviceMappingSpecification.Builder = {
    value.fold(self) { v =>
      self.ebs(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala(value: Option[String]): InstanceBlockDeviceMappingSpecification.Builder = {
    value.fold(self) { v =>
      self.noDevice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala(value: Option[String]): InstanceBlockDeviceMappingSpecification.Builder = {
    value.fold(self) { v =>
      self.virtualName(v)
    }
  }

}

final class InstanceBlockDeviceMappingSpecificationOps(val self: InstanceBlockDeviceMappingSpecification)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsAsScala: Option[EbsInstanceBlockDeviceSpecification] = Option(self.ebs)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noDeviceAsScala: Option[String] = Option(self.noDevice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNameAsScala: Option[String] = Option(self.virtualName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceBlockDeviceMappingSpecificationOps {

  implicit def toInstanceBlockDeviceMappingSpecificationBuilderOps(
      v: InstanceBlockDeviceMappingSpecification.Builder
  ): InstanceBlockDeviceMappingSpecificationBuilderOps = new InstanceBlockDeviceMappingSpecificationBuilderOps(v)

  implicit def toInstanceBlockDeviceMappingSpecificationOps(
      v: InstanceBlockDeviceMappingSpecification
  ): InstanceBlockDeviceMappingSpecificationOps = new InstanceBlockDeviceMappingSpecificationOps(v)

}
