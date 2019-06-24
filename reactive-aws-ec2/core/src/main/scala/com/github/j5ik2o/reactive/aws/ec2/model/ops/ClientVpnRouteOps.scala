// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnRouteBuilderOps(val self: ClientVpnRoute.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.destinationCidr(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetSubnetAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.targetSubnet(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClientVpnRouteStatus]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ClientVpnRoute.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class ClientVpnRouteOps(val self: ClientVpnRoute) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrAsScala: Option[String] = Option(self.destinationCidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetSubnetAsScala: Option[String] = Option(self.targetSubnet)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala: Option[String] = Option(self.origin)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientVpnRouteStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnRouteOps {

  implicit def toClientVpnRouteBuilderOps(v: ClientVpnRoute.Builder): ClientVpnRouteBuilderOps =
    new ClientVpnRouteBuilderOps(v)

  implicit def toClientVpnRouteOps(v: ClientVpnRoute): ClientVpnRouteOps = new ClientVpnRouteOps(v)

}
