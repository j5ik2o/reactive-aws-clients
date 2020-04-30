// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayRequestBuilderOps(val self: DeleteTransitGatewayRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): DeleteTransitGatewayRequest.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 


}

final class DeleteTransitGatewayRequestOps(val self: DeleteTransitGatewayRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayRequestOps {

implicit def toDeleteTransitGatewayRequestBuilderOps(v: DeleteTransitGatewayRequest.Builder): DeleteTransitGatewayRequestBuilderOps = new DeleteTransitGatewayRequestBuilderOps(v)

implicit def toDeleteTransitGatewayRequestOps(v: DeleteTransitGatewayRequest): DeleteTransitGatewayRequestOps = new DeleteTransitGatewayRequestOps(v)

}

