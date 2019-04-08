// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRequestOptionsBuilderOps(val self: TransitGatewayRequestOptions.Builder) extends AnyVal {

  final def amazonSideAsnAsScala(value: Option[Long]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.amazonSideAsn(v)
    }
  }

  final def autoAcceptSharedAttachmentsAsScala(
      value: Option[AutoAcceptSharedAttachmentsValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.autoAcceptSharedAttachments(v)
    }
  }

  final def defaultRouteTableAssociationAsScala(
      value: Option[DefaultRouteTableAssociationValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTableAssociation(v)
    }
  }

  final def defaultRouteTablePropagationAsScala(
      value: Option[DefaultRouteTablePropagationValue]
  ): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTablePropagation(v)
    }
  }

  final def vpnEcmpSupportAsScala(value: Option[VpnEcmpSupportValue]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.vpnEcmpSupport(v)
    }
  }

  final def dnsSupportAsScala(value: Option[DnsSupportValue]): TransitGatewayRequestOptions.Builder = {
    value.fold(self) { v =>
      self.dnsSupport(v)
    }
  }

}

final class TransitGatewayRequestOptionsOps(val self: TransitGatewayRequestOptions) extends AnyVal {

  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

  final def autoAcceptSharedAttachmentsAsScala: Option[AutoAcceptSharedAttachmentsValue] =
    Option(self.autoAcceptSharedAttachments)

  final def defaultRouteTableAssociationAsScala: Option[DefaultRouteTableAssociationValue] =
    Option(self.defaultRouteTableAssociation)

  final def defaultRouteTablePropagationAsScala: Option[DefaultRouteTablePropagationValue] =
    Option(self.defaultRouteTablePropagation)

  final def vpnEcmpSupportAsScala: Option[VpnEcmpSupportValue] = Option(self.vpnEcmpSupport)

  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRequestOptionsOps {

  implicit def toTransitGatewayRequestOptionsBuilderOps(
      v: TransitGatewayRequestOptions.Builder
  ): TransitGatewayRequestOptionsBuilderOps = new TransitGatewayRequestOptionsBuilderOps(v)

  implicit def toTransitGatewayRequestOptionsOps(v: TransitGatewayRequestOptions): TransitGatewayRequestOptionsOps =
    new TransitGatewayRequestOptionsOps(v)

}
