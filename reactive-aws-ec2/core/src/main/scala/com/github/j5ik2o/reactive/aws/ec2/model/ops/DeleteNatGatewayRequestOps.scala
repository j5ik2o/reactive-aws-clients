// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNatGatewayRequestBuilderOps(val self: DeleteNatGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala(value: Option[String]): DeleteNatGatewayRequest.Builder = {
    value.fold(self) { v => self.natGatewayId(v) }
  }

}

final class DeleteNatGatewayRequestOps(val self: DeleteNatGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNatGatewayRequestOps {

  implicit def toDeleteNatGatewayRequestBuilderOps(
      v: DeleteNatGatewayRequest.Builder
  ): DeleteNatGatewayRequestBuilderOps = new DeleteNatGatewayRequestBuilderOps(v)

  implicit def toDeleteNatGatewayRequestOps(v: DeleteNatGatewayRequest): DeleteNatGatewayRequestOps =
    new DeleteNatGatewayRequestOps(v)

}
