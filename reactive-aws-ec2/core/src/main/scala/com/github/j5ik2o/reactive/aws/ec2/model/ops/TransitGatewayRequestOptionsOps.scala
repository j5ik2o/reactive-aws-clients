// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRequestOptionsBuilderOps(val self: TransitGatewayRequestOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonSideAsnAsScala(value: Option[Long]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.amazonSideAsn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoAcceptSharedAttachmentsAsScala(
      value: Option[AutoAcceptSharedAttachmentsValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.autoAcceptSharedAttachments(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTableAssociationAsScala(
      value: Option[DefaultRouteTableAssociationValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.defaultRouteTableAssociation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTablePropagationAsScala(
      value: Option[DefaultRouteTablePropagationValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.defaultRouteTablePropagation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnEcmpSupportAsScala(value: Option[VpnEcmpSupportValue]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.vpnEcmpSupport(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala(value: Option[DnsSupportValue]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.dnsSupport(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multicastSupportAsScala(value: Option[MulticastSupportValue]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v => self.multicastSupport(v) }
  }

}

final class TransitGatewayRequestOptionsOps(val self: TransitGatewayRequestOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoAcceptSharedAttachmentsAsScala: Option[AutoAcceptSharedAttachmentsValue] =
    Option(self.autoAcceptSharedAttachments)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTableAssociationAsScala: Option[DefaultRouteTableAssociationValue] =
    Option(self.defaultRouteTableAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTablePropagationAsScala: Option[DefaultRouteTablePropagationValue] =
    Option(self.defaultRouteTablePropagation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnEcmpSupportAsScala: Option[VpnEcmpSupportValue] = Option(self.vpnEcmpSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multicastSupportAsScala: Option[MulticastSupportValue] = Option(self.multicastSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRequestOptionsOps {

  implicit def toTransitGatewayRequestOptionsBuilderOps(
      v: TransitGatewayRequestOptions.Builder
  ): TransitGatewayRequestOptionsBuilderOps = new TransitGatewayRequestOptionsBuilderOps(v)

  implicit def toTransitGatewayRequestOptionsOps(v: TransitGatewayRequestOptions): TransitGatewayRequestOptionsOps =
    new TransitGatewayRequestOptionsOps(v)

}
