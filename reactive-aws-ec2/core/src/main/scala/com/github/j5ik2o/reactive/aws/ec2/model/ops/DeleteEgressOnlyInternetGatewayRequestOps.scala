// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteEgressOnlyInternetGatewayRequestBuilderOps(val self: DeleteEgressOnlyInternetGatewayRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): DeleteEgressOnlyInternetGatewayRequest.Builder = {
            value.fold(self){ v => self.egressOnlyInternetGatewayId(v) }
            } 


}

final class DeleteEgressOnlyInternetGatewayRequestOps(val self: DeleteEgressOnlyInternetGatewayRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteEgressOnlyInternetGatewayRequestOps {

implicit def toDeleteEgressOnlyInternetGatewayRequestBuilderOps(v: DeleteEgressOnlyInternetGatewayRequest.Builder): DeleteEgressOnlyInternetGatewayRequestBuilderOps = new DeleteEgressOnlyInternetGatewayRequestBuilderOps(v)

implicit def toDeleteEgressOnlyInternetGatewayRequestOps(v: DeleteEgressOnlyInternetGatewayRequest): DeleteEgressOnlyInternetGatewayRequestOps = new DeleteEgressOnlyInternetGatewayRequestOps(v)

}

