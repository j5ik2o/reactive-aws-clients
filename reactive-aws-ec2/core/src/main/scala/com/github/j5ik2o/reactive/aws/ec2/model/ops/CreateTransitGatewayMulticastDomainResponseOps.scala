// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayMulticastDomainResponseBuilderOps(
    val self: CreateTransitGatewayMulticastDomainResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainAsScala(
      value: Option[TransitGatewayMulticastDomain]
  ): CreateTransitGatewayMulticastDomainResponse.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomain(v) }
  }

}

final class CreateTransitGatewayMulticastDomainResponseOps(val self: CreateTransitGatewayMulticastDomainResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainAsScala: Option[TransitGatewayMulticastDomain] =
    Option(self.transitGatewayMulticastDomain)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayMulticastDomainResponseOps {

  implicit def toCreateTransitGatewayMulticastDomainResponseBuilderOps(
      v: CreateTransitGatewayMulticastDomainResponse.Builder
  ): CreateTransitGatewayMulticastDomainResponseBuilderOps =
    new CreateTransitGatewayMulticastDomainResponseBuilderOps(v)

  implicit def toCreateTransitGatewayMulticastDomainResponseOps(
      v: CreateTransitGatewayMulticastDomainResponse
  ): CreateTransitGatewayMulticastDomainResponseOps = new CreateTransitGatewayMulticastDomainResponseOps(v)

}
