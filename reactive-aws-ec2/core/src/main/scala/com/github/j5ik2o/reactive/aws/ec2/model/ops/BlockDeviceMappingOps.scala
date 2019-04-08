// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BlockDeviceMappingBuilderOps(val self: BlockDeviceMapping.Builder) extends AnyVal {

  final def deviceNameAsScala(value: Option[String]): BlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  final def virtualNameAsScala(value: Option[String]): BlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.virtualName(v)
    }
  }

  final def ebsAsScala(value: Option[EbsBlockDevice]): BlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.ebs(v)
    }
  }

  final def noDeviceAsScala(value: Option[String]): BlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.noDevice(v)
    }
  }

}

final class BlockDeviceMappingOps(val self: BlockDeviceMapping) extends AnyVal {

  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  final def virtualNameAsScala: Option[String] = Option(self.virtualName)

  final def ebsAsScala: Option[EbsBlockDevice] = Option(self.ebs)

  final def noDeviceAsScala: Option[String] = Option(self.noDevice)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBlockDeviceMappingOps {

  implicit def toBlockDeviceMappingBuilderOps(v: BlockDeviceMapping.Builder): BlockDeviceMappingBuilderOps =
    new BlockDeviceMappingBuilderOps(v)

  implicit def toBlockDeviceMappingOps(v: BlockDeviceMapping): BlockDeviceMappingOps = new BlockDeviceMappingOps(v)

}
