// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastRegisteredGroupSourcesBuilderOps(
    val self: TransitGatewayMulticastRegisteredGroupSources.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastRegisteredGroupSources.Builder = {
    value.fold(self) { v =>
      self.transitGatewayMulticastDomainId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredNetworkInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): TransitGatewayMulticastRegisteredGroupSources.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.registeredNetworkInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(value: Option[String]): TransitGatewayMulticastRegisteredGroupSources.Builder = {
    value.fold(self) { v =>
      self.groupIpAddress(v)
    }
  }

}

final class TransitGatewayMulticastRegisteredGroupSourcesOps(val self: TransitGatewayMulticastRegisteredGroupSources)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredNetworkInterfaceIdsAsScala: Option[Seq[String]] = Option(self.registeredNetworkInterfaceIds).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastRegisteredGroupSourcesOps {

  implicit def toTransitGatewayMulticastRegisteredGroupSourcesBuilderOps(
      v: TransitGatewayMulticastRegisteredGroupSources.Builder
  ): TransitGatewayMulticastRegisteredGroupSourcesBuilderOps =
    new TransitGatewayMulticastRegisteredGroupSourcesBuilderOps(v)

  implicit def toTransitGatewayMulticastRegisteredGroupSourcesOps(
      v: TransitGatewayMulticastRegisteredGroupSources
  ): TransitGatewayMulticastRegisteredGroupSourcesOps = new TransitGatewayMulticastRegisteredGroupSourcesOps(v)

}
