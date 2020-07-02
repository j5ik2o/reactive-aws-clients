// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterTransitGatewayMulticastGroupSourcesRequestBuilderOps(
    val self: DeregisterTransitGatewayMulticastGroupSourcesRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): DeregisterTransitGatewayMulticastGroupSourcesRequest.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(
      value: Option[String]
  ): DeregisterTransitGatewayMulticastGroupSourcesRequest.Builder = {
    value.fold(self) { v => self.groupIpAddress(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): DeregisterTransitGatewayMulticastGroupSourcesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaceIds(v.asJava)
    }
  }

}

final class DeregisterTransitGatewayMulticastGroupSourcesRequestOps(
    val self: DeregisterTransitGatewayMulticastGroupSourcesRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdsAsScala: Option[Seq[String]] =
    Option(self.networkInterfaceIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterTransitGatewayMulticastGroupSourcesRequestOps {

  implicit def toDeregisterTransitGatewayMulticastGroupSourcesRequestBuilderOps(
      v: DeregisterTransitGatewayMulticastGroupSourcesRequest.Builder
  ): DeregisterTransitGatewayMulticastGroupSourcesRequestBuilderOps =
    new DeregisterTransitGatewayMulticastGroupSourcesRequestBuilderOps(v)

  implicit def toDeregisterTransitGatewayMulticastGroupSourcesRequestOps(
      v: DeregisterTransitGatewayMulticastGroupSourcesRequest
  ): DeregisterTransitGatewayMulticastGroupSourcesRequestOps =
    new DeregisterTransitGatewayMulticastGroupSourcesRequestOps(v)

}
