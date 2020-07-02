// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLocalGatewayRouteResponseBuilderOps(val self: CreateLocalGatewayRouteResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeAsScala(value: Option[LocalGatewayRoute]): CreateLocalGatewayRouteResponse.Builder = {
    value.fold(self) { v => self.route(v) }
  }

}

final class CreateLocalGatewayRouteResponseOps(val self: CreateLocalGatewayRouteResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeAsScala: Option[LocalGatewayRoute] = Option(self.route)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLocalGatewayRouteResponseOps {

  implicit def toCreateLocalGatewayRouteResponseBuilderOps(
      v: CreateLocalGatewayRouteResponse.Builder
  ): CreateLocalGatewayRouteResponseBuilderOps = new CreateLocalGatewayRouteResponseBuilderOps(v)

  implicit def toCreateLocalGatewayRouteResponseOps(
      v: CreateLocalGatewayRouteResponse
  ): CreateLocalGatewayRouteResponseOps = new CreateLocalGatewayRouteResponseOps(v)

}
