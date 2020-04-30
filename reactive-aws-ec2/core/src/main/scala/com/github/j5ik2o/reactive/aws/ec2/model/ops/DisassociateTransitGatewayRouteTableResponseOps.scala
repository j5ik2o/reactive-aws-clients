// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateTransitGatewayRouteTableResponseBuilderOps(val self: DisassociateTransitGatewayRouteTableResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationAsScala(value: Option[TransitGatewayAssociation]): DisassociateTransitGatewayRouteTableResponse.Builder = {
            value.fold(self){ v => self.association(v) }
            } 


}

final class DisassociateTransitGatewayRouteTableResponseOps(val self: DisassociateTransitGatewayRouteTableResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def associationAsScala: Option[TransitGatewayAssociation] = Option(self.association) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateTransitGatewayRouteTableResponseOps {

implicit def toDisassociateTransitGatewayRouteTableResponseBuilderOps(v: DisassociateTransitGatewayRouteTableResponse.Builder): DisassociateTransitGatewayRouteTableResponseBuilderOps = new DisassociateTransitGatewayRouteTableResponseBuilderOps(v)

implicit def toDisassociateTransitGatewayRouteTableResponseOps(v: DisassociateTransitGatewayRouteTableResponse): DisassociateTransitGatewayRouteTableResponseOps = new DisassociateTransitGatewayRouteTableResponseOps(v)

}

