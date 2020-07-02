// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayVpcAttachmentRequestOptionsBuilderOps(
    val self: CreateTransitGatewayVpcAttachmentRequestOptions.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala(
      value: Option[DnsSupportValue]
  ): CreateTransitGatewayVpcAttachmentRequestOptions.Builder = {
    value.fold(self) { v => self.dnsSupport(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportAsScala(
      value: Option[Ipv6SupportValue]
  ): CreateTransitGatewayVpcAttachmentRequestOptions.Builder = {
    value.fold(self) { v => self.ipv6Support(v) }
  }

}

final class CreateTransitGatewayVpcAttachmentRequestOptionsOps(
    val self: CreateTransitGatewayVpcAttachmentRequestOptions
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportAsScala: Option[Ipv6SupportValue] = Option(self.ipv6Support)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayVpcAttachmentRequestOptionsOps {

  implicit def toCreateTransitGatewayVpcAttachmentRequestOptionsBuilderOps(
      v: CreateTransitGatewayVpcAttachmentRequestOptions.Builder
  ): CreateTransitGatewayVpcAttachmentRequestOptionsBuilderOps =
    new CreateTransitGatewayVpcAttachmentRequestOptionsBuilderOps(v)

  implicit def toCreateTransitGatewayVpcAttachmentRequestOptionsOps(
      v: CreateTransitGatewayVpcAttachmentRequestOptions
  ): CreateTransitGatewayVpcAttachmentRequestOptionsOps = new CreateTransitGatewayVpcAttachmentRequestOptionsOps(v)

}
