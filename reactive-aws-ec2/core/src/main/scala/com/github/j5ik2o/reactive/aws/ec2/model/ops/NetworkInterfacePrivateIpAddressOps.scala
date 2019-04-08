// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfacePrivateIpAddressBuilderOps(val self: NetworkInterfacePrivateIpAddress.Builder)
    extends AnyVal {

  final def associationAsScala(value: Option[NetworkInterfaceAssociation]): NetworkInterfacePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  final def primaryAsScala(value: Option[Boolean]): NetworkInterfacePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.primary(v)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): NetworkInterfacePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): NetworkInterfacePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

}

final class NetworkInterfacePrivateIpAddressOps(val self: NetworkInterfacePrivateIpAddress) extends AnyVal {

  final def associationAsScala: Option[NetworkInterfaceAssociation] = Option(self.association)

  final def primaryAsScala: Option[Boolean] = Option(self.primary)

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfacePrivateIpAddressOps {

  implicit def toNetworkInterfacePrivateIpAddressBuilderOps(
      v: NetworkInterfacePrivateIpAddress.Builder
  ): NetworkInterfacePrivateIpAddressBuilderOps = new NetworkInterfacePrivateIpAddressBuilderOps(v)

  implicit def toNetworkInterfacePrivateIpAddressOps(
      v: NetworkInterfacePrivateIpAddress
  ): NetworkInterfacePrivateIpAddressOps = new NetworkInterfacePrivateIpAddressOps(v)

}
