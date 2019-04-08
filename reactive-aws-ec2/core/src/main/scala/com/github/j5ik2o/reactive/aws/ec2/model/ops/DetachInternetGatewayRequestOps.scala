// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachInternetGatewayRequestBuilderOps(val self: DetachInternetGatewayRequest.Builder) extends AnyVal {

  final def internetGatewayIdAsScala(value: Option[String]): DetachInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.internetGatewayId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): DetachInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class DetachInternetGatewayRequestOps(val self: DetachInternetGatewayRequest) extends AnyVal {

  final def internetGatewayIdAsScala: Option[String] = Option(self.internetGatewayId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachInternetGatewayRequestOps {

  implicit def toDetachInternetGatewayRequestBuilderOps(
      v: DetachInternetGatewayRequest.Builder
  ): DetachInternetGatewayRequestBuilderOps = new DetachInternetGatewayRequestBuilderOps(v)

  implicit def toDetachInternetGatewayRequestOps(v: DetachInternetGatewayRequest): DetachInternetGatewayRequestOps =
    new DetachInternetGatewayRequestOps(v)

}
