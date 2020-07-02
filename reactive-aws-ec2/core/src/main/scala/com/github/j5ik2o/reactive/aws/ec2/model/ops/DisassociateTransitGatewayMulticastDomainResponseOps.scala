// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateTransitGatewayMulticastDomainResponseBuilderOps(
    val self: DisassociateTransitGatewayMulticastDomainResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala(
      value: Option[TransitGatewayMulticastDomainAssociations]
  ): DisassociateTransitGatewayMulticastDomainResponse.Builder = {
    value.fold(self) { v => self.associations(v) }
  }

}

final class DisassociateTransitGatewayMulticastDomainResponseOps(
    val self: DisassociateTransitGatewayMulticastDomainResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala: Option[TransitGatewayMulticastDomainAssociations] = Option(self.associations)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateTransitGatewayMulticastDomainResponseOps {

  implicit def toDisassociateTransitGatewayMulticastDomainResponseBuilderOps(
      v: DisassociateTransitGatewayMulticastDomainResponse.Builder
  ): DisassociateTransitGatewayMulticastDomainResponseBuilderOps =
    new DisassociateTransitGatewayMulticastDomainResponseBuilderOps(v)

  implicit def toDisassociateTransitGatewayMulticastDomainResponseOps(
      v: DisassociateTransitGatewayMulticastDomainResponse
  ): DisassociateTransitGatewayMulticastDomainResponseOps = new DisassociateTransitGatewayMulticastDomainResponseOps(v)

}
