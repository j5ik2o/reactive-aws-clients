// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayMulticastDomainResponseBuilderOps(
    val self: DeleteTransitGatewayMulticastDomainResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainAsScala(
      value: Option[TransitGatewayMulticastDomain]
  ): DeleteTransitGatewayMulticastDomainResponse.Builder = {
    value.fold(self) { v =>
      self.transitGatewayMulticastDomain(v)
    }
  }

}

final class DeleteTransitGatewayMulticastDomainResponseOps(val self: DeleteTransitGatewayMulticastDomainResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainAsScala: Option[TransitGatewayMulticastDomain] =
    Option(self.transitGatewayMulticastDomain)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayMulticastDomainResponseOps {

  implicit def toDeleteTransitGatewayMulticastDomainResponseBuilderOps(
      v: DeleteTransitGatewayMulticastDomainResponse.Builder
  ): DeleteTransitGatewayMulticastDomainResponseBuilderOps =
    new DeleteTransitGatewayMulticastDomainResponseBuilderOps(v)

  implicit def toDeleteTransitGatewayMulticastDomainResponseOps(
      v: DeleteTransitGatewayMulticastDomainResponse
  ): DeleteTransitGatewayMulticastDomainResponseOps = new DeleteTransitGatewayMulticastDomainResponseOps(v)

}
