// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayResponseBuilderOps(val self: DeleteTransitGatewayResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAsScala(value: Option[TransitGateway]): DeleteTransitGatewayResponse.Builder = {
            value.fold(self){ v => self.transitGateway(v) }
            } 


}

final class DeleteTransitGatewayResponseOps(val self: DeleteTransitGatewayResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAsScala: Option[TransitGateway] = Option(self.transitGateway) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayResponseOps {

implicit def toDeleteTransitGatewayResponseBuilderOps(v: DeleteTransitGatewayResponse.Builder): DeleteTransitGatewayResponseBuilderOps = new DeleteTransitGatewayResponseBuilderOps(v)

implicit def toDeleteTransitGatewayResponseOps(v: DeleteTransitGatewayResponse): DeleteTransitGatewayResponseOps = new DeleteTransitGatewayResponseOps(v)

}

