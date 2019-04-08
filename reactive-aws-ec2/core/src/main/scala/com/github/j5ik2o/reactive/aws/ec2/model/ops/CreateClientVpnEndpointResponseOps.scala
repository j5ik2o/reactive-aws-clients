// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnEndpointResponseBuilderOps(val self: CreateClientVpnEndpointResponse.Builder)
    extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): CreateClientVpnEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def statusAsScala(value: Option[ClientVpnEndpointStatus]): CreateClientVpnEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def dnsNameAsScala(value: Option[String]): CreateClientVpnEndpointResponse.Builder = {
    value.fold(self) { v =>
      self.dnsName(v)
    }
  }

}

final class CreateClientVpnEndpointResponseOps(val self: CreateClientVpnEndpointResponse) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def statusAsScala: Option[ClientVpnEndpointStatus] = Option(self.status)

  final def dnsNameAsScala: Option[String] = Option(self.dnsName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnEndpointResponseOps {

  implicit def toCreateClientVpnEndpointResponseBuilderOps(
      v: CreateClientVpnEndpointResponse.Builder
  ): CreateClientVpnEndpointResponseBuilderOps = new CreateClientVpnEndpointResponseBuilderOps(v)

  implicit def toCreateClientVpnEndpointResponseOps(
      v: CreateClientVpnEndpointResponse
  ): CreateClientVpnEndpointResponseOps = new CreateClientVpnEndpointResponseOps(v)

}
