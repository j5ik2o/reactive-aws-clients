// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableTransitGatewayRouteTablePropagationResponseBuilderOps(
    val self: EnableTransitGatewayRouteTablePropagationResponse.Builder
) extends AnyVal {

  final def propagationAsScala(
      value: Option[TransitGatewayPropagation]
  ): EnableTransitGatewayRouteTablePropagationResponse.Builder = {
    value.fold(self) { v =>
      self.propagation(v)
    }
  }

}

final class EnableTransitGatewayRouteTablePropagationResponseOps(
    val self: EnableTransitGatewayRouteTablePropagationResponse
) extends AnyVal {

  final def propagationAsScala: Option[TransitGatewayPropagation] = Option(self.propagation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableTransitGatewayRouteTablePropagationResponseOps {

  implicit def toEnableTransitGatewayRouteTablePropagationResponseBuilderOps(
      v: EnableTransitGatewayRouteTablePropagationResponse.Builder
  ): EnableTransitGatewayRouteTablePropagationResponseBuilderOps =
    new EnableTransitGatewayRouteTablePropagationResponseBuilderOps(v)

  implicit def toEnableTransitGatewayRouteTablePropagationResponseOps(
      v: EnableTransitGatewayRouteTablePropagationResponse
  ): EnableTransitGatewayRouteTablePropagationResponseOps = new EnableTransitGatewayRouteTablePropagationResponseOps(v)

}
