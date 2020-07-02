// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SubnetBuilderOps(val self: Subnet.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdentifierAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.subnetIdentifier(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetAvailabilityZoneAsScala(value: Option[String]): Subnet.Builder = {
    value.fold(self) { v => self.subnetAvailabilityZone(v) }
  }

}

final class SubnetOps(val self: Subnet) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdentifierAsScala: Option[String] = Option(self.subnetIdentifier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetAvailabilityZoneAsScala: Option[String] = Option(self.subnetAvailabilityZone)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetOps {

  implicit def toSubnetBuilderOps(v: Subnet.Builder): SubnetBuilderOps = new SubnetBuilderOps(v)

  implicit def toSubnetOps(v: Subnet): SubnetOps = new SubnetOps(v)

}
