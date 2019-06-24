// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnTunnelOptionsSpecificationBuilderOps(val self: VpnTunnelOptionsSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelInsideCidrAsScala(value: Option[String]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v =>
      self.tunnelInsideCidr(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preSharedKeyAsScala(value: Option[String]): VpnTunnelOptionsSpecification.Builder = {
    value.fold(self) { v =>
      self.preSharedKey(v)
    }
  }

}

final class VpnTunnelOptionsSpecificationOps(val self: VpnTunnelOptionsSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tunnelInsideCidrAsScala: Option[String] = Option(self.tunnelInsideCidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preSharedKeyAsScala: Option[String] = Option(self.preSharedKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnTunnelOptionsSpecificationOps {

  implicit def toVpnTunnelOptionsSpecificationBuilderOps(
      v: VpnTunnelOptionsSpecification.Builder
  ): VpnTunnelOptionsSpecificationBuilderOps = new VpnTunnelOptionsSpecificationBuilderOps(v)

  implicit def toVpnTunnelOptionsSpecificationOps(v: VpnTunnelOptionsSpecification): VpnTunnelOptionsSpecificationOps =
    new VpnTunnelOptionsSpecificationOps(v)

}
