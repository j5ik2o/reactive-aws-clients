// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateEgressOnlyInternetGatewayResponseBuilderOps(val self: CreateEgressOnlyInternetGatewayResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateEgressOnlyInternetGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayAsScala(
      value: Option[EgressOnlyInternetGateway]
  ): CreateEgressOnlyInternetGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.egressOnlyInternetGateway(v)
    }
  }

}

final class CreateEgressOnlyInternetGatewayResponseOps(val self: CreateEgressOnlyInternetGatewayResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayAsScala: Option[EgressOnlyInternetGateway] = Option(self.egressOnlyInternetGateway)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEgressOnlyInternetGatewayResponseOps {

  implicit def toCreateEgressOnlyInternetGatewayResponseBuilderOps(
      v: CreateEgressOnlyInternetGatewayResponse.Builder
  ): CreateEgressOnlyInternetGatewayResponseBuilderOps = new CreateEgressOnlyInternetGatewayResponseBuilderOps(v)

  implicit def toCreateEgressOnlyInternetGatewayResponseOps(
      v: CreateEgressOnlyInternetGatewayResponse
  ): CreateEgressOnlyInternetGatewayResponseOps = new CreateEgressOnlyInternetGatewayResponseOps(v)

}
