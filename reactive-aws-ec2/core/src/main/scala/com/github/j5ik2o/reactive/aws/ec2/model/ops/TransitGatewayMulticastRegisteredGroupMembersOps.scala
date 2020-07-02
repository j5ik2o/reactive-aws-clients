// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastRegisteredGroupMembersBuilderOps(
    val self: TransitGatewayMulticastRegisteredGroupMembers.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastRegisteredGroupMembers.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredNetworkInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): TransitGatewayMulticastRegisteredGroupMembers.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.registeredNetworkInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala(value: Option[String]): TransitGatewayMulticastRegisteredGroupMembers.Builder = {
    value.fold(self) { v => self.groupIpAddress(v) }
  }

}

final class TransitGatewayMulticastRegisteredGroupMembersOps(val self: TransitGatewayMulticastRegisteredGroupMembers)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredNetworkInterfaceIdsAsScala: Option[Seq[String]] =
    Option(self.registeredNetworkInterfaceIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIpAddressAsScala: Option[String] = Option(self.groupIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastRegisteredGroupMembersOps {

  implicit def toTransitGatewayMulticastRegisteredGroupMembersBuilderOps(
      v: TransitGatewayMulticastRegisteredGroupMembers.Builder
  ): TransitGatewayMulticastRegisteredGroupMembersBuilderOps =
    new TransitGatewayMulticastRegisteredGroupMembersBuilderOps(v)

  implicit def toTransitGatewayMulticastRegisteredGroupMembersOps(
      v: TransitGatewayMulticastRegisteredGroupMembers
  ): TransitGatewayMulticastRegisteredGroupMembersOps = new TransitGatewayMulticastRegisteredGroupMembersOps(v)

}
