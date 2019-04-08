// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesBlockDeviceMappingBuilderOps(val self: ScheduledInstancesBlockDeviceMapping.Builder)
    extends AnyVal {

  final def deviceNameAsScala(value: Option[String]): ScheduledInstancesBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  final def ebsAsScala(value: Option[ScheduledInstancesEbs]): ScheduledInstancesBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.ebs(v)
    }
  }

  final def noDeviceAsScala(value: Option[String]): ScheduledInstancesBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.noDevice(v)
    }
  }

  final def virtualNameAsScala(value: Option[String]): ScheduledInstancesBlockDeviceMapping.Builder = {
    value.fold(self) { v =>
      self.virtualName(v)
    }
  }

}

final class ScheduledInstancesBlockDeviceMappingOps(val self: ScheduledInstancesBlockDeviceMapping) extends AnyVal {

  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  final def ebsAsScala: Option[ScheduledInstancesEbs] = Option(self.ebs)

  final def noDeviceAsScala: Option[String] = Option(self.noDevice)

  final def virtualNameAsScala: Option[String] = Option(self.virtualName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesBlockDeviceMappingOps {

  implicit def toScheduledInstancesBlockDeviceMappingBuilderOps(
      v: ScheduledInstancesBlockDeviceMapping.Builder
  ): ScheduledInstancesBlockDeviceMappingBuilderOps = new ScheduledInstancesBlockDeviceMappingBuilderOps(v)

  implicit def toScheduledInstancesBlockDeviceMappingOps(
      v: ScheduledInstancesBlockDeviceMapping
  ): ScheduledInstancesBlockDeviceMappingOps = new ScheduledInstancesBlockDeviceMappingOps(v)

}
