// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInterfaceIpv6AddressBuilderOps(val self: NetworkInterfaceIpv6Address.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6AddressAsScala(value: Option[String]): NetworkInterfaceIpv6Address.Builder = {
            value.fold(self){ v => self.ipv6Address(v) }
            } 


}

final class NetworkInterfaceIpv6AddressOps(val self: NetworkInterfaceIpv6Address) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInterfaceIpv6AddressOps {

implicit def toNetworkInterfaceIpv6AddressBuilderOps(v: NetworkInterfaceIpv6Address.Builder): NetworkInterfaceIpv6AddressBuilderOps = new NetworkInterfaceIpv6AddressBuilderOps(v)

implicit def toNetworkInterfaceIpv6AddressOps(v: NetworkInterfaceIpv6Address): NetworkInterfaceIpv6AddressOps = new NetworkInterfaceIpv6AddressOps(v)

}

