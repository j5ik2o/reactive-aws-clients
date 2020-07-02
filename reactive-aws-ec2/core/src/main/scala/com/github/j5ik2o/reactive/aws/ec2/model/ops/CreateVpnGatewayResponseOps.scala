// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnGatewayResponseBuilderOps(val self: CreateVpnGatewayResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayAsScala(value: Option[VpnGateway]): CreateVpnGatewayResponse.Builder = {
    value.fold(self) { v => self.vpnGateway(v) }
  }

}

final class CreateVpnGatewayResponseOps(val self: CreateVpnGatewayResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnGatewayAsScala: Option[VpnGateway] = Option(self.vpnGateway)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpnGatewayResponseOps {

  implicit def toCreateVpnGatewayResponseBuilderOps(
      v: CreateVpnGatewayResponse.Builder
  ): CreateVpnGatewayResponseBuilderOps = new CreateVpnGatewayResponseBuilderOps(v)

  implicit def toCreateVpnGatewayResponseOps(v: CreateVpnGatewayResponse): CreateVpnGatewayResponseOps =
    new CreateVpnGatewayResponseOps(v)

}
