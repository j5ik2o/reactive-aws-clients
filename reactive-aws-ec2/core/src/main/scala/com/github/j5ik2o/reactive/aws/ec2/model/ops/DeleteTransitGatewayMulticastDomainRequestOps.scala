// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTransitGatewayMulticastDomainRequestBuilderOps(
    val self: DeleteTransitGatewayMulticastDomainRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): DeleteTransitGatewayMulticastDomainRequest.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

}

final class DeleteTransitGatewayMulticastDomainRequestOps(val self: DeleteTransitGatewayMulticastDomainRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTransitGatewayMulticastDomainRequestOps {

  implicit def toDeleteTransitGatewayMulticastDomainRequestBuilderOps(
      v: DeleteTransitGatewayMulticastDomainRequest.Builder
  ): DeleteTransitGatewayMulticastDomainRequestBuilderOps = new DeleteTransitGatewayMulticastDomainRequestBuilderOps(v)

  implicit def toDeleteTransitGatewayMulticastDomainRequestOps(
      v: DeleteTransitGatewayMulticastDomainRequest
  ): DeleteTransitGatewayMulticastDomainRequestOps = new DeleteTransitGatewayMulticastDomainRequestOps(v)

}
