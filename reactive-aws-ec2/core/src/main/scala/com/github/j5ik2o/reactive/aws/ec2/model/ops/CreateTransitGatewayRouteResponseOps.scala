// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRouteResponseBuilderOps(val self: CreateTransitGatewayRouteResponse.Builder)
    extends AnyVal {

  final def routeAsScala(value: Option[TransitGatewayRoute]): CreateTransitGatewayRouteResponse.Builder = {
    value.fold(self) { v =>
      self.route(v)
    }
  }

}

final class CreateTransitGatewayRouteResponseOps(val self: CreateTransitGatewayRouteResponse) extends AnyVal {

  final def routeAsScala: Option[TransitGatewayRoute] = Option(self.route)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRouteResponseOps {

  implicit def toCreateTransitGatewayRouteResponseBuilderOps(
      v: CreateTransitGatewayRouteResponse.Builder
  ): CreateTransitGatewayRouteResponseBuilderOps = new CreateTransitGatewayRouteResponseBuilderOps(v)

  implicit def toCreateTransitGatewayRouteResponseOps(
      v: CreateTransitGatewayRouteResponse
  ): CreateTransitGatewayRouteResponseOps = new CreateTransitGatewayRouteResponseOps(v)

}
