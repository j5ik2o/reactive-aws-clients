// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayOptionsBuilderOps(val self: TransitGatewayOptions.Builder) extends AnyVal {

  final def amazonSideAsnAsScala(value: Option[Long]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.amazonSideAsn(v)
    }
  }

  final def autoAcceptSharedAttachmentsAsScala(
      value: Option[AutoAcceptSharedAttachmentsValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.autoAcceptSharedAttachments(v)
    }
  }

  final def defaultRouteTableAssociationAsScala(
      value: Option[DefaultRouteTableAssociationValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTableAssociation(v)
    }
  }

  final def associationDefaultRouteTableIdAsScala(value: Option[String]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.associationDefaultRouteTableId(v)
    }
  }

  final def defaultRouteTablePropagationAsScala(
      value: Option[DefaultRouteTablePropagationValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTablePropagation(v)
    }
  }

  final def propagationDefaultRouteTableIdAsScala(value: Option[String]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.propagationDefaultRouteTableId(v)
    }
  }

  final def vpnEcmpSupportAsScala(value: Option[VpnEcmpSupportValue]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.vpnEcmpSupport(v)
    }
  }

  final def dnsSupportAsScala(value: Option[DnsSupportValue]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.dnsSupport(v)
    }
  }

}

final class TransitGatewayOptionsOps(val self: TransitGatewayOptions) extends AnyVal {

  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

  final def autoAcceptSharedAttachmentsAsScala: Option[AutoAcceptSharedAttachmentsValue] =
    Option(self.autoAcceptSharedAttachments)

  final def defaultRouteTableAssociationAsScala: Option[DefaultRouteTableAssociationValue] =
    Option(self.defaultRouteTableAssociation)

  final def associationDefaultRouteTableIdAsScala: Option[String] = Option(self.associationDefaultRouteTableId)

  final def defaultRouteTablePropagationAsScala: Option[DefaultRouteTablePropagationValue] =
    Option(self.defaultRouteTablePropagation)

  final def propagationDefaultRouteTableIdAsScala: Option[String] = Option(self.propagationDefaultRouteTableId)

  final def vpnEcmpSupportAsScala: Option[VpnEcmpSupportValue] = Option(self.vpnEcmpSupport)

  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayOptionsOps {

  implicit def toTransitGatewayOptionsBuilderOps(v: TransitGatewayOptions.Builder): TransitGatewayOptionsBuilderOps =
    new TransitGatewayOptionsBuilderOps(v)

  implicit def toTransitGatewayOptionsOps(v: TransitGatewayOptions): TransitGatewayOptionsOps =
    new TransitGatewayOptionsOps(v)

}
