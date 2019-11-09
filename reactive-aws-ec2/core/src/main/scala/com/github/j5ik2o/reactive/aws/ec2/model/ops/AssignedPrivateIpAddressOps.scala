// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignedPrivateIpAddressBuilderOps(val self: AssignedPrivateIpAddress.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): AssignedPrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

}

final class AssignedPrivateIpAddressOps(val self: AssignedPrivateIpAddress) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssignedPrivateIpAddressOps {

  implicit def toAssignedPrivateIpAddressBuilderOps(
      v: AssignedPrivateIpAddress.Builder
  ): AssignedPrivateIpAddressBuilderOps = new AssignedPrivateIpAddressBuilderOps(v)

  implicit def toAssignedPrivateIpAddressOps(v: AssignedPrivateIpAddress): AssignedPrivateIpAddressOps =
    new AssignedPrivateIpAddressOps(v)

}
