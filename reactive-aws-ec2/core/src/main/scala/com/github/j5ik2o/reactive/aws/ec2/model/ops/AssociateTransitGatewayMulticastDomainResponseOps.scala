// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateTransitGatewayMulticastDomainResponseBuilderOps(
    val self: AssociateTransitGatewayMulticastDomainResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala(
      value: Option[TransitGatewayMulticastDomainAssociations]
  ): AssociateTransitGatewayMulticastDomainResponse.Builder = {
    value.fold(self) { v =>
      self.associations(v)
    }
  }

}

final class AssociateTransitGatewayMulticastDomainResponseOps(val self: AssociateTransitGatewayMulticastDomainResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala: Option[TransitGatewayMulticastDomainAssociations] = Option(self.associations)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateTransitGatewayMulticastDomainResponseOps {

  implicit def toAssociateTransitGatewayMulticastDomainResponseBuilderOps(
      v: AssociateTransitGatewayMulticastDomainResponse.Builder
  ): AssociateTransitGatewayMulticastDomainResponseBuilderOps =
    new AssociateTransitGatewayMulticastDomainResponseBuilderOps(v)

  implicit def toAssociateTransitGatewayMulticastDomainResponseOps(
      v: AssociateTransitGatewayMulticastDomainResponse
  ): AssociateTransitGatewayMulticastDomainResponseOps = new AssociateTransitGatewayMulticastDomainResponseOps(v)

}
