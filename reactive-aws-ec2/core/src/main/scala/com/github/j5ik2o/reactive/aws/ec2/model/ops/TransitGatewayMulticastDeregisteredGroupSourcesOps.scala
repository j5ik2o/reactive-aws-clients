// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastDeregisteredGroupSourcesBuilderOps(
    val self: TransitGatewayMulticastDeregisteredGroupSources.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastDeregisteredGroupSources.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deregisteredNetworkInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): TransitGatewayMulticastDeregisteredGroupSources.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deregisteredNetworkInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(value: Option[String]): TransitGatewayMulticastDeregisteredGroupSources.Builder = {
    value.fold(self) { v => self.groupIpAddress(v) }
  }

}

final class TransitGatewayMulticastDeregisteredGroupSourcesOps(
    val self: TransitGatewayMulticastDeregisteredGroupSources
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deregisteredNetworkInterfaceIdsAsScala: Option[Seq[String]] =
    Option(self.deregisteredNetworkInterfaceIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastDeregisteredGroupSourcesOps {

  implicit def toTransitGatewayMulticastDeregisteredGroupSourcesBuilderOps(
      v: TransitGatewayMulticastDeregisteredGroupSources.Builder
  ): TransitGatewayMulticastDeregisteredGroupSourcesBuilderOps =
    new TransitGatewayMulticastDeregisteredGroupSourcesBuilderOps(v)

  implicit def toTransitGatewayMulticastDeregisteredGroupSourcesOps(
      v: TransitGatewayMulticastDeregisteredGroupSources
  ): TransitGatewayMulticastDeregisteredGroupSourcesOps = new TransitGatewayMulticastDeregisteredGroupSourcesOps(v)

}
