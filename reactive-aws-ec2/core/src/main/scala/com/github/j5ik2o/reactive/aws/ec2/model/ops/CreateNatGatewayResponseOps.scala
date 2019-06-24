// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNatGatewayResponseBuilderOps(val self: CreateNatGatewayResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateNatGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayAsScala(value: Option[NatGateway]): CreateNatGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.natGateway(v)
    }
  }

}

final class CreateNatGatewayResponseOps(val self: CreateNatGatewayResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayAsScala: Option[NatGateway] = Option(self.natGateway)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNatGatewayResponseOps {

  implicit def toCreateNatGatewayResponseBuilderOps(
      v: CreateNatGatewayResponse.Builder
  ): CreateNatGatewayResponseBuilderOps = new CreateNatGatewayResponseBuilderOps(v)

  implicit def toCreateNatGatewayResponseOps(v: CreateNatGatewayResponse): CreateNatGatewayResponseOps =
    new CreateNatGatewayResponseOps(v)

}
