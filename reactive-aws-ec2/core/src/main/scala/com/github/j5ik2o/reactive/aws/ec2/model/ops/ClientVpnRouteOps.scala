// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnRouteBuilderOps(val self: ClientVpnRoute.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def destinationCidrAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.destinationCidr(v)
    }
  }

  final def targetSubnetAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.targetSubnet(v)
    }
  }

  final def typeAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def originAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  final def statusAsScala(value: Option[ClientVpnRouteStatus]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class ClientVpnRouteOps(val self: ClientVpnRoute) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def destinationCidrAsScala: Option[String] = Option(self.destinationCidr)

  final def targetSubnetAsScala: Option[String] = Option(self.targetSubnet)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def originAsScala: Option[String] = Option(self.origin)

  final def statusAsScala: Option[ClientVpnRouteStatus] = Option(self.status)

  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnRouteOps {

  implicit def toClientVpnRouteBuilderOps(v: ClientVpnRoute.Builder): ClientVpnRouteBuilderOps =
    new ClientVpnRouteBuilderOps(v)

  implicit def toClientVpnRouteOps(v: ClientVpnRoute): ClientVpnRouteOps = new ClientVpnRouteOps(v)

}
