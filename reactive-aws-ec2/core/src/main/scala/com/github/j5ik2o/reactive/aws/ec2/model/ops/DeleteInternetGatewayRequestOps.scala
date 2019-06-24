// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteInternetGatewayRequestBuilderOps(val self: DeleteInternetGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdAsScala(value: Option[String]): DeleteInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.internetGatewayId(v)
    }
  }

}

final class DeleteInternetGatewayRequestOps(val self: DeleteInternetGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdAsScala: Option[String] = Option(self.internetGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteInternetGatewayRequestOps {

  implicit def toDeleteInternetGatewayRequestBuilderOps(
      v: DeleteInternetGatewayRequest.Builder
  ): DeleteInternetGatewayRequestBuilderOps = new DeleteInternetGatewayRequestBuilderOps(v)

  implicit def toDeleteInternetGatewayRequestOps(v: DeleteInternetGatewayRequest): DeleteInternetGatewayRequestOps =
    new DeleteInternetGatewayRequestOps(v)

}
