// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNatGatewayRequestBuilderOps(val self: CreateNatGatewayRequest.Builder) extends AnyVal {

  final def allocationIdAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class CreateNatGatewayRequestOps(val self: CreateNatGatewayRequest) extends AnyVal {

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNatGatewayRequestOps {

  implicit def toCreateNatGatewayRequestBuilderOps(
      v: CreateNatGatewayRequest.Builder
  ): CreateNatGatewayRequestBuilderOps = new CreateNatGatewayRequestBuilderOps(v)

  implicit def toCreateNatGatewayRequestOps(v: CreateNatGatewayRequest): CreateNatGatewayRequestOps =
    new CreateNatGatewayRequestOps(v)

}
