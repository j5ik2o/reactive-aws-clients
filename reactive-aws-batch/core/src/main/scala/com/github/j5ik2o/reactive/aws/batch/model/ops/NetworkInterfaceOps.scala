// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class NetworkInterfaceBuilderOps(val self: NetworkInterface.Builder) extends AnyVal {

  final def attachmentIdAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  } // String

  final def ipv6AddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.ipv6Address(v)
    }
  } // String

  final def privateIpv4AddressAsScala(value: Option[String]): NetworkInterface.Builder = {
    value.fold(self) { v =>
      self.privateIpv4Address(v)
    }
  } // String

}

final class NetworkInterfaceOps(val self: NetworkInterface) extends AnyVal {

  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId) // String

  final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address) // String

  final def privateIpv4AddressAsScala: Option[String] = Option(self.privateIpv4Address) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceOps {

  implicit def toNetworkInterfaceBuilderOps(v: NetworkInterface.Builder): NetworkInterfaceBuilderOps =
    new NetworkInterfaceBuilderOps(v)

  implicit def toNetworkInterfaceOps(v: NetworkInterface): NetworkInterfaceOps = new NetworkInterfaceOps(v)

}
