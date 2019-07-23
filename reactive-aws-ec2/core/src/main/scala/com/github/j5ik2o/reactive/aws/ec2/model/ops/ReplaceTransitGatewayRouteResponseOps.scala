// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceTransitGatewayRouteResponseBuilderOps(val self: ReplaceTransitGatewayRouteResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeAsScala(value: Option[TransitGatewayRoute]): ReplaceTransitGatewayRouteResponse.Builder = {
    value.fold(self) { v =>
      self.route(v)
    }
  }

}

final class ReplaceTransitGatewayRouteResponseOps(val self: ReplaceTransitGatewayRouteResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeAsScala: Option[TransitGatewayRoute] = Option(self.route)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceTransitGatewayRouteResponseOps {

  implicit def toReplaceTransitGatewayRouteResponseBuilderOps(
      v: ReplaceTransitGatewayRouteResponse.Builder
  ): ReplaceTransitGatewayRouteResponseBuilderOps = new ReplaceTransitGatewayRouteResponseBuilderOps(v)

  implicit def toReplaceTransitGatewayRouteResponseOps(
      v: ReplaceTransitGatewayRouteResponse
  ): ReplaceTransitGatewayRouteResponseOps = new ReplaceTransitGatewayRouteResponseOps(v)

}
