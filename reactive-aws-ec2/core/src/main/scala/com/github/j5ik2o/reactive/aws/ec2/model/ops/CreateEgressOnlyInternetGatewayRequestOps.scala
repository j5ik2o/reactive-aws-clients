// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateEgressOnlyInternetGatewayRequestBuilderOps(val self: CreateEgressOnlyInternetGatewayRequest.Builder)
    extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateEgressOnlyInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): CreateEgressOnlyInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class CreateEgressOnlyInternetGatewayRequestOps(val self: CreateEgressOnlyInternetGatewayRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEgressOnlyInternetGatewayRequestOps {

  implicit def toCreateEgressOnlyInternetGatewayRequestBuilderOps(
      v: CreateEgressOnlyInternetGatewayRequest.Builder
  ): CreateEgressOnlyInternetGatewayRequestBuilderOps = new CreateEgressOnlyInternetGatewayRequestBuilderOps(v)

  implicit def toCreateEgressOnlyInternetGatewayRequestOps(
      v: CreateEgressOnlyInternetGatewayRequest
  ): CreateEgressOnlyInternetGatewayRequestOps = new CreateEgressOnlyInternetGatewayRequestOps(v)

}
