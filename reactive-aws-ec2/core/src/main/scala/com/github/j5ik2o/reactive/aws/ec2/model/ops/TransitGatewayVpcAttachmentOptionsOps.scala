// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayVpcAttachmentOptionsBuilderOps(val self: TransitGatewayVpcAttachmentOptions.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala(value: Option[DnsSupportValue]): TransitGatewayVpcAttachmentOptions.Builder = {
    value.fold(self) { v =>
      self.dnsSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportAsScala(value: Option[Ipv6SupportValue]): TransitGatewayVpcAttachmentOptions.Builder = {
    value.fold(self) { v =>
      self.ipv6Support(v)
    }
  }

}

final class TransitGatewayVpcAttachmentOptionsOps(val self: TransitGatewayVpcAttachmentOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportAsScala: Option[Ipv6SupportValue] = Option(self.ipv6Support)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayVpcAttachmentOptionsOps {

  implicit def toTransitGatewayVpcAttachmentOptionsBuilderOps(
      v: TransitGatewayVpcAttachmentOptions.Builder
  ): TransitGatewayVpcAttachmentOptionsBuilderOps = new TransitGatewayVpcAttachmentOptionsBuilderOps(v)

  implicit def toTransitGatewayVpcAttachmentOptionsOps(
      v: TransitGatewayVpcAttachmentOptions
  ): TransitGatewayVpcAttachmentOptionsOps = new TransitGatewayVpcAttachmentOptionsOps(v)

}
