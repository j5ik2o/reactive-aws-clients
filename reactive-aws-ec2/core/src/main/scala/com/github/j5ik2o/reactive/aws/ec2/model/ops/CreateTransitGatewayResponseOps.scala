// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayResponseBuilderOps(val self: CreateTransitGatewayResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAsScala(value: Option[TransitGateway]): CreateTransitGatewayResponse.Builder = {
            value.fold(self){ v => self.transitGateway(v) }
            } 


}

final class CreateTransitGatewayResponseOps(val self: CreateTransitGatewayResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAsScala: Option[TransitGateway] = Option(self.transitGateway) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayResponseOps {

implicit def toCreateTransitGatewayResponseBuilderOps(v: CreateTransitGatewayResponse.Builder): CreateTransitGatewayResponseBuilderOps = new CreateTransitGatewayResponseBuilderOps(v)

implicit def toCreateTransitGatewayResponseOps(v: CreateTransitGatewayResponse): CreateTransitGatewayResponseOps = new CreateTransitGatewayResponseOps(v)

}

