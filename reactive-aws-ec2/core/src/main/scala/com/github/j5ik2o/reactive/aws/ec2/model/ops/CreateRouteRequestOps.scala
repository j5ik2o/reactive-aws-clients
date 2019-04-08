// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateRouteRequestBuilderOps(val self: CreateRouteRequest.Builder) extends AnyVal {

  final def destinationCidrBlockAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def destinationIpv6CidrBlockAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationIpv6CidrBlock(v)
    }
  }

  final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.egressOnlyInternetGatewayId(v)
    }
  }

  final def gatewayIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.gatewayId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def natGatewayIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.natGatewayId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def routeTableIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  final def vpcPeeringConnectionIdAsScala(value: Option[String]): CreateRouteRequest.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class CreateRouteRequestOps(val self: CreateRouteRequest) extends AnyVal {

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def destinationIpv6CidrBlockAsScala: Option[String] = Option(self.destinationIpv6CidrBlock)

  final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId)

  final def gatewayIdAsScala: Option[String] = Option(self.gatewayId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRouteRequestOps {

  implicit def toCreateRouteRequestBuilderOps(v: CreateRouteRequest.Builder): CreateRouteRequestBuilderOps =
    new CreateRouteRequestBuilderOps(v)

  implicit def toCreateRouteRequestOps(v: CreateRouteRequest): CreateRouteRequestOps = new CreateRouteRequestOps(v)

}
