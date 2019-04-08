// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTransitGatewayVpcAttachmentRequestOptionsBuilderOps(
    val self: ModifyTransitGatewayVpcAttachmentRequestOptions.Builder
) extends AnyVal {

  final def dnsSupportAsScala(
      value: Option[DnsSupportValue]
  ): ModifyTransitGatewayVpcAttachmentRequestOptions.Builder = {
    value.fold(self) { v =>
      self.dnsSupport(v)
    }
  }

  final def ipv6SupportAsScala(
      value: Option[Ipv6SupportValue]
  ): ModifyTransitGatewayVpcAttachmentRequestOptions.Builder = {
    value.fold(self) { v =>
      self.ipv6Support(v)
    }
  }

}

final class ModifyTransitGatewayVpcAttachmentRequestOptionsOps(
    val self: ModifyTransitGatewayVpcAttachmentRequestOptions
) extends AnyVal {

  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

  final def ipv6SupportAsScala: Option[Ipv6SupportValue] = Option(self.ipv6Support)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTransitGatewayVpcAttachmentRequestOptionsOps {

  implicit def toModifyTransitGatewayVpcAttachmentRequestOptionsBuilderOps(
      v: ModifyTransitGatewayVpcAttachmentRequestOptions.Builder
  ): ModifyTransitGatewayVpcAttachmentRequestOptionsBuilderOps =
    new ModifyTransitGatewayVpcAttachmentRequestOptionsBuilderOps(v)

  implicit def toModifyTransitGatewayVpcAttachmentRequestOptionsOps(
      v: ModifyTransitGatewayVpcAttachmentRequestOptions
  ): ModifyTransitGatewayVpcAttachmentRequestOptionsOps = new ModifyTransitGatewayVpcAttachmentRequestOptionsOps(v)

}
