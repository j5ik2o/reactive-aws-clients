// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnRouteRequestBuilderOps(val self: CreateClientVpnRouteRequest.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def destinationCidrBlockAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def targetVpcSubnetIdAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
    value.fold(self) { v =>
      self.targetVpcSubnetId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class CreateClientVpnRouteRequestOps(val self: CreateClientVpnRouteRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def targetVpcSubnetIdAsScala: Option[String] = Option(self.targetVpcSubnetId)

  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnRouteRequestOps {

  implicit def toCreateClientVpnRouteRequestBuilderOps(
      v: CreateClientVpnRouteRequest.Builder
  ): CreateClientVpnRouteRequestBuilderOps = new CreateClientVpnRouteRequestBuilderOps(v)

  implicit def toCreateClientVpnRouteRequestOps(v: CreateClientVpnRouteRequest): CreateClientVpnRouteRequestOps =
    new CreateClientVpnRouteRequestOps(v)

}
