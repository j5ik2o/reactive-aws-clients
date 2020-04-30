// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLocalGatewayRouteRequestBuilderOps(val self: DeleteLocalGatewayRouteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): DeleteLocalGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTableIdAsScala(value: Option[String]): DeleteLocalGatewayRouteRequest.Builder = {
            value.fold(self){ v => self.localGatewayRouteTableId(v) }
            } 


}

final class DeleteLocalGatewayRouteRequestOps(val self: DeleteLocalGatewayRouteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLocalGatewayRouteRequestOps {

implicit def toDeleteLocalGatewayRouteRequestBuilderOps(v: DeleteLocalGatewayRouteRequest.Builder): DeleteLocalGatewayRouteRequestBuilderOps = new DeleteLocalGatewayRouteRequestBuilderOps(v)

implicit def toDeleteLocalGatewayRouteRequestOps(v: DeleteLocalGatewayRouteRequest): DeleteLocalGatewayRouteRequestOps = new DeleteLocalGatewayRouteRequestOps(v)

}

