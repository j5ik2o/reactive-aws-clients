// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesPrivateIpAddressConfigBuilderOps(
    val self: ScheduledInstancesPrivateIpAddressConfig.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryAsScala(value: Option[Boolean]): ScheduledInstancesPrivateIpAddressConfig.Builder = {
    value.fold(self) { v => self.primary(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): ScheduledInstancesPrivateIpAddressConfig.Builder = {
    value.fold(self) { v => self.privateIpAddress(v) }
  }

}

final class ScheduledInstancesPrivateIpAddressConfigOps(val self: ScheduledInstancesPrivateIpAddressConfig)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryAsScala: Option[Boolean] = Option(self.primary)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesPrivateIpAddressConfigOps {

  implicit def toScheduledInstancesPrivateIpAddressConfigBuilderOps(
      v: ScheduledInstancesPrivateIpAddressConfig.Builder
  ): ScheduledInstancesPrivateIpAddressConfigBuilderOps = new ScheduledInstancesPrivateIpAddressConfigBuilderOps(v)

  implicit def toScheduledInstancesPrivateIpAddressConfigOps(
      v: ScheduledInstancesPrivateIpAddressConfig
  ): ScheduledInstancesPrivateIpAddressConfigOps = new ScheduledInstancesPrivateIpAddressConfigOps(v)

}
