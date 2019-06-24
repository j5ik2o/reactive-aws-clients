// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceIpv6AddressBuilderOps(val self: InstanceIpv6Address.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala(value: Option[String]): InstanceIpv6Address.Builder = {
    value.fold(self) { v =>
      self.ipv6Address(v)
    }
  }

}

final class InstanceIpv6AddressOps(val self: InstanceIpv6Address) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceIpv6AddressOps {

  implicit def toInstanceIpv6AddressBuilderOps(v: InstanceIpv6Address.Builder): InstanceIpv6AddressBuilderOps =
    new InstanceIpv6AddressBuilderOps(v)

  implicit def toInstanceIpv6AddressOps(v: InstanceIpv6Address): InstanceIpv6AddressOps = new InstanceIpv6AddressOps(v)

}
