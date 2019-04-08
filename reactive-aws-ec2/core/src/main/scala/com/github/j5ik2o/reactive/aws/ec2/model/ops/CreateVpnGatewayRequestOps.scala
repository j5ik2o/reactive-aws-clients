// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnGatewayRequestBuilderOps(val self: CreateVpnGatewayRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def typeAsScala(value: Option[GatewayType]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def amazonSideAsnAsScala(value: Option[Long]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.amazonSideAsn(v)
    }
  }

}

final class CreateVpnGatewayRequestOps(val self: CreateVpnGatewayRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def typeAsScala: Option[GatewayType] = Option(self.`type`)

  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpnGatewayRequestOps {

  implicit def toCreateVpnGatewayRequestBuilderOps(
      v: CreateVpnGatewayRequest.Builder
  ): CreateVpnGatewayRequestBuilderOps = new CreateVpnGatewayRequestBuilderOps(v)

  implicit def toCreateVpnGatewayRequestOps(v: CreateVpnGatewayRequest): CreateVpnGatewayRequestOps =
    new CreateVpnGatewayRequestOps(v)

}
