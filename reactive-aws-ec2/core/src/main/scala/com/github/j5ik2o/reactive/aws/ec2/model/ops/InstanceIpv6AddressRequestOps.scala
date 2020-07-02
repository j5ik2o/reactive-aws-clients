// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceIpv6AddressRequestBuilderOps(val self: InstanceIpv6AddressRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala(value: Option[String]): InstanceIpv6AddressRequest.Builder = {
    value.fold(self) { v => self.ipv6Address(v) }
  }

}

final class InstanceIpv6AddressRequestOps(val self: InstanceIpv6AddressRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceIpv6AddressRequestOps {

  implicit def toInstanceIpv6AddressRequestBuilderOps(
      v: InstanceIpv6AddressRequest.Builder
  ): InstanceIpv6AddressRequestBuilderOps = new InstanceIpv6AddressRequestBuilderOps(v)

  implicit def toInstanceIpv6AddressRequestOps(v: InstanceIpv6AddressRequest): InstanceIpv6AddressRequestOps =
    new InstanceIpv6AddressRequestOps(v)

}
