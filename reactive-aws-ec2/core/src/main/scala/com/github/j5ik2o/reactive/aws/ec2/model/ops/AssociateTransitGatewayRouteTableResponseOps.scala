// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateTransitGatewayRouteTableResponseBuilderOps(
    val self: AssociateTransitGatewayRouteTableResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala(
      value: Option[TransitGatewayAssociation]
  ): AssociateTransitGatewayRouteTableResponse.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

}

final class AssociateTransitGatewayRouteTableResponseOps(val self: AssociateTransitGatewayRouteTableResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala: Option[TransitGatewayAssociation] = Option(self.association)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateTransitGatewayRouteTableResponseOps {

  implicit def toAssociateTransitGatewayRouteTableResponseBuilderOps(
      v: AssociateTransitGatewayRouteTableResponse.Builder
  ): AssociateTransitGatewayRouteTableResponseBuilderOps = new AssociateTransitGatewayRouteTableResponseBuilderOps(v)

  implicit def toAssociateTransitGatewayRouteTableResponseOps(
      v: AssociateTransitGatewayRouteTableResponse
  ): AssociateTransitGatewayRouteTableResponseOps = new AssociateTransitGatewayRouteTableResponseOps(v)

}
