// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayRouteResponseBuilderOps(val self: DeleteTransitGatewayRouteResponse.Builder)
    extends AnyVal {

  final def routeAsScala(value: Option[TransitGatewayRoute]): DeleteTransitGatewayRouteResponse.Builder = {
    value.fold(self) { v =>
      self.route(v)
    }
  }

}

final class DeleteTransitGatewayRouteResponseOps(val self: DeleteTransitGatewayRouteResponse) extends AnyVal {

  final def routeAsScala: Option[TransitGatewayRoute] = Option(self.route)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayRouteResponseOps {

  implicit def toDeleteTransitGatewayRouteResponseBuilderOps(
      v: DeleteTransitGatewayRouteResponse.Builder
  ): DeleteTransitGatewayRouteResponseBuilderOps = new DeleteTransitGatewayRouteResponseBuilderOps(v)

  implicit def toDeleteTransitGatewayRouteResponseOps(
      v: DeleteTransitGatewayRouteResponse
  ): DeleteTransitGatewayRouteResponseOps = new DeleteTransitGatewayRouteResponseOps(v)

}
