// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNatGatewayResponseBuilderOps(val self: DeleteNatGatewayResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def natGatewayIdAsScala(value: Option[String]): DeleteNatGatewayResponse.Builder = {
            value.fold(self){ v => self.natGatewayId(v) }
            } 


}

final class DeleteNatGatewayResponseOps(val self: DeleteNatGatewayResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNatGatewayResponseOps {

implicit def toDeleteNatGatewayResponseBuilderOps(v: DeleteNatGatewayResponse.Builder): DeleteNatGatewayResponseBuilderOps = new DeleteNatGatewayResponseBuilderOps(v)

implicit def toDeleteNatGatewayResponseOps(v: DeleteNatGatewayResponse): DeleteNatGatewayResponseOps = new DeleteNatGatewayResponseOps(v)

}

