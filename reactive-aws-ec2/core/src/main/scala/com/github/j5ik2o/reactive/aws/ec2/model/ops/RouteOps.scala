// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteBuilderOps(val self: Route.Builder) extends AnyVal {

  final def destinationCidrBlockAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def destinationIpv6CidrBlockAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.destinationIpv6CidrBlock(v)
    }
  }

  final def destinationPrefixListIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.destinationPrefixListId(v)
    }
  }

  final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.egressOnlyInternetGatewayId(v)
    }
  }

  final def gatewayIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.gatewayId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceOwnerIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.instanceOwnerId(v)
    }
  }

  final def natGatewayIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.natGatewayId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def originAsScala(value: Option[RouteOrigin]): Route.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  final def stateAsScala(value: Option[RouteState]): Route.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def vpcPeeringConnectionIdAsScala(value: Option[String]): Route.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class RouteOps(val self: Route) extends AnyVal {

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def destinationIpv6CidrBlockAsScala: Option[String] = Option(self.destinationIpv6CidrBlock)

  final def destinationPrefixListIdAsScala: Option[String] = Option(self.destinationPrefixListId)

  final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId)

  final def gatewayIdAsScala: Option[String] = Option(self.gatewayId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceOwnerIdAsScala: Option[String] = Option(self.instanceOwnerId)

  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def originAsScala: Option[RouteOrigin] = Option(self.origin)

  final def stateAsScala: Option[RouteState] = Option(self.state)

  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteOps {

  implicit def toRouteBuilderOps(v: Route.Builder): RouteBuilderOps = new RouteBuilderOps(v)

  implicit def toRouteOps(v: Route): RouteOps = new RouteOps(v)

}
