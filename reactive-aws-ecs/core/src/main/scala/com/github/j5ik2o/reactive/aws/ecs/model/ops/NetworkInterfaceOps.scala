// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class NetworkInterfaceBuilderOps(val self: NetworkInterface.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpv4AddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateIpv4Address(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.ipv6Address(v)
    }
  }

}

final class NetworkInterfaceOps(val self: NetworkInterface) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpv4AddressAsScala: Option[String] = Option(self.privateIpv4Address)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceOps {

  implicit def toNetworkInterfaceBuilderOps(v: NetworkInterface.Builder): NetworkInterfaceBuilderOps =
    new NetworkInterfaceBuilderOps(v)

  implicit def toNetworkInterfaceOps(v: NetworkInterface): NetworkInterfaceOps = new NetworkInterfaceOps(v)

}
