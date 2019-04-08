// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnStaticRouteBuilderOps(val self: VpnStaticRoute.Builder) extends AnyVal {

  final def destinationCidrBlockAsScala(value: Option[String]): VpnStaticRoute.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  final def sourceAsScala(value: Option[VpnStaticRouteSource]): VpnStaticRoute.Builder = {
    value.fold(self) { v =>
      self.source(v)
    }
  }

  final def stateAsScala(value: Option[VpnState]): VpnStaticRoute.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class VpnStaticRouteOps(val self: VpnStaticRoute) extends AnyVal {

  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  final def sourceAsScala: Option[VpnStaticRouteSource] = Option(self.source)

  final def stateAsScala: Option[VpnState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnStaticRouteOps {

  implicit def toVpnStaticRouteBuilderOps(v: VpnStaticRoute.Builder): VpnStaticRouteBuilderOps =
    new VpnStaticRouteBuilderOps(v)

  implicit def toVpnStaticRouteOps(v: VpnStaticRoute): VpnStaticRouteOps = new VpnStaticRouteOps(v)

}
