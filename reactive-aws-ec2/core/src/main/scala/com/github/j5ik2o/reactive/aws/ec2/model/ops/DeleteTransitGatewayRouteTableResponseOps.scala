// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayRouteTableResponseBuilderOps(val self: DeleteTransitGatewayRouteTableResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableAsScala(value: Option[TransitGatewayRouteTable]): DeleteTransitGatewayRouteTableResponse.Builder = {
            value.fold(self){ v => self.transitGatewayRouteTable(v) }
            } 


}

final class DeleteTransitGatewayRouteTableResponseOps(val self: DeleteTransitGatewayRouteTableResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableAsScala: Option[TransitGatewayRouteTable] = Option(self.transitGatewayRouteTable) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayRouteTableResponseOps {

implicit def toDeleteTransitGatewayRouteTableResponseBuilderOps(v: DeleteTransitGatewayRouteTableResponse.Builder): DeleteTransitGatewayRouteTableResponseBuilderOps = new DeleteTransitGatewayRouteTableResponseBuilderOps(v)

implicit def toDeleteTransitGatewayRouteTableResponseOps(v: DeleteTransitGatewayRouteTableResponse): DeleteTransitGatewayRouteTableResponseOps = new DeleteTransitGatewayRouteTableResponseOps(v)

}

