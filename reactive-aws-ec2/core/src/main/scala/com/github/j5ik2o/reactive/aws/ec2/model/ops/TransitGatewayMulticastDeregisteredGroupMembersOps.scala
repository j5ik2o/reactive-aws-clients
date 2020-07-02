// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastDeregisteredGroupMembersBuilderOps(
    val self: TransitGatewayMulticastDeregisteredGroupMembers.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastDeregisteredGroupMembers.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deregisteredNetworkInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): TransitGatewayMulticastDeregisteredGroupMembers.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deregisteredNetworkInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(value: Option[String]): TransitGatewayMulticastDeregisteredGroupMembers.Builder = {
    value.fold(self) { v => self.groupIpAddress(v) }
  }

}

final class TransitGatewayMulticastDeregisteredGroupMembersOps(
    val self: TransitGatewayMulticastDeregisteredGroupMembers
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
trait ToTransitGatewayMulticastDeregisteredGroupMembersOps {

  implicit def toTransitGatewayMulticastDeregisteredGroupMembersBuilderOps(
      v: TransitGatewayMulticastDeregisteredGroupMembers.Builder
  ): TransitGatewayMulticastDeregisteredGroupMembersBuilderOps =
    new TransitGatewayMulticastDeregisteredGroupMembersBuilderOps(v)

  implicit def toTransitGatewayMulticastDeregisteredGroupMembersOps(
      v: TransitGatewayMulticastDeregisteredGroupMembers
  ): TransitGatewayMulticastDeregisteredGroupMembersOps = new TransitGatewayMulticastDeregisteredGroupMembersOps(v)

}
