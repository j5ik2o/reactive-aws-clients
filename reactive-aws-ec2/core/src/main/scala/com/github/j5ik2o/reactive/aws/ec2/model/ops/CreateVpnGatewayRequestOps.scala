// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnGatewayRequestBuilderOps(val self: CreateVpnGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[GatewayType]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonSideAsnAsScala(value: Option[Long]): CreateVpnGatewayRequest.Builder = {
    value.fold(self) { v => self.amazonSideAsn(v) }
  }

}

final class CreateVpnGatewayRequestOps(val self: CreateVpnGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[GatewayType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
