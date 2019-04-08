// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnConnectionRequestBuilderOps(val self: CreateVpnConnectionRequest.Builder) extends AnyVal {

  final def customerGatewayIdAsScala(value: Option[String]): CreateVpnConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.customerGatewayId(v)
    }
  }

  final def typeAsScala(value: Option[String]): CreateVpnConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def vpnGatewayIdAsScala(value: Option[String]): CreateVpnConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.vpnGatewayId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): CreateVpnConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def optionsAsScala(value: Option[VpnConnectionOptionsSpecification]): CreateVpnConnectionRequest.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

}

final class CreateVpnConnectionRequestOps(val self: CreateVpnConnectionRequest) extends AnyVal {

  final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def optionsAsScala: Option[VpnConnectionOptionsSpecification] = Option(self.options)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpnConnectionRequestOps {

  implicit def toCreateVpnConnectionRequestBuilderOps(
      v: CreateVpnConnectionRequest.Builder
  ): CreateVpnConnectionRequestBuilderOps = new CreateVpnConnectionRequestBuilderOps(v)

  implicit def toCreateVpnConnectionRequestOps(v: CreateVpnConnectionRequest): CreateVpnConnectionRequestOps =
    new CreateVpnConnectionRequestOps(v)

}
