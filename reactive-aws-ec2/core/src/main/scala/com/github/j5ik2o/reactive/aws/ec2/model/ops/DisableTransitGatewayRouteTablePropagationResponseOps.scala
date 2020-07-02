// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableTransitGatewayRouteTablePropagationResponseBuilderOps(
    val self: DisableTransitGatewayRouteTablePropagationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagationAsScala(
      value: Option[TransitGatewayPropagation]
  ): DisableTransitGatewayRouteTablePropagationResponse.Builder = {
    value.fold(self) { v => self.propagation(v) }
  }

}

final class DisableTransitGatewayRouteTablePropagationResponseOps(
    val self: DisableTransitGatewayRouteTablePropagationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagationAsScala: Option[TransitGatewayPropagation] = Option(self.propagation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableTransitGatewayRouteTablePropagationResponseOps {

  implicit def toDisableTransitGatewayRouteTablePropagationResponseBuilderOps(
      v: DisableTransitGatewayRouteTablePropagationResponse.Builder
  ): DisableTransitGatewayRouteTablePropagationResponseBuilderOps =
    new DisableTransitGatewayRouteTablePropagationResponseBuilderOps(v)

  implicit def toDisableTransitGatewayRouteTablePropagationResponseOps(
      v: DisableTransitGatewayRouteTablePropagationResponse
  ): DisableTransitGatewayRouteTablePropagationResponseOps =
    new DisableTransitGatewayRouteTablePropagationResponseOps(v)

}
