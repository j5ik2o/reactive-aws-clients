// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayOptionsBuilderOps(val self: TransitGatewayOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonSideAsnAsScala(value: Option[Long]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.amazonSideAsn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoAcceptSharedAttachmentsAsScala(
      value: Option[AutoAcceptSharedAttachmentsValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.autoAcceptSharedAttachments(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTableAssociationAsScala(
      value: Option[DefaultRouteTableAssociationValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTableAssociation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationDefaultRouteTableIdAsScala(value: Option[String]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.associationDefaultRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTablePropagationAsScala(
      value: Option[DefaultRouteTablePropagationValue]
  ): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.defaultRouteTablePropagation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagationDefaultRouteTableIdAsScala(value: Option[String]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.propagationDefaultRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnEcmpSupportAsScala(value: Option[VpnEcmpSupportValue]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.vpnEcmpSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala(value: Option[DnsSupportValue]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.dnsSupport(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multicastSupportAsScala(value: Option[MulticastSupportValue]): TransitGatewayOptions.Builder = {
    value.fold(self) { v =>
      self.multicastSupport(v)
    }
  }

}

final class TransitGatewayOptionsOps(val self: TransitGatewayOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoAcceptSharedAttachmentsAsScala: Option[AutoAcceptSharedAttachmentsValue] =
    Option(self.autoAcceptSharedAttachments)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTableAssociationAsScala: Option[DefaultRouteTableAssociationValue] =
    Option(self.defaultRouteTableAssociation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationDefaultRouteTableIdAsScala: Option[String] = Option(self.associationDefaultRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultRouteTablePropagationAsScala: Option[DefaultRouteTablePropagationValue] =
    Option(self.defaultRouteTablePropagation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagationDefaultRouteTableIdAsScala: Option[String] = Option(self.propagationDefaultRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnEcmpSupportAsScala: Option[VpnEcmpSupportValue] = Option(self.vpnEcmpSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSupportAsScala: Option[DnsSupportValue] = Option(self.dnsSupport)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multicastSupportAsScala: Option[MulticastSupportValue] = Option(self.multicastSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayOptionsOps {

  implicit def toTransitGatewayOptionsBuilderOps(v: TransitGatewayOptions.Builder): TransitGatewayOptionsBuilderOps =
    new TransitGatewayOptionsBuilderOps(v)

  implicit def toTransitGatewayOptionsOps(v: TransitGatewayOptions): TransitGatewayOptionsOps =
    new TransitGatewayOptionsOps(v)

}
