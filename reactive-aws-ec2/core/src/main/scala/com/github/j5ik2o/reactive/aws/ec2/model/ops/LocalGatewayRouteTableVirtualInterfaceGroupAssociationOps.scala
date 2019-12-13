// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayRouteTableVirtualInterfaceGroupAssociationBuilderOps(
    val self: LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationIdAsScala(
      value: Option[String]
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableVirtualInterfaceGroupAssociationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala(
      value: Option[String]
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder = {
    value.fold(self) { v =>
      self.localGatewayVirtualInterfaceGroupId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala(
      value: Option[String]
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder = {
    value.fold(self) { v =>
      self.localGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(
      value: Option[String]
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class LocalGatewayRouteTableVirtualInterfaceGroupAssociationOps(
    val self: LocalGatewayRouteTableVirtualInterfaceGroupAssociation
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVirtualInterfaceGroupAssociationIdAsScala: Option[String] =
    Option(self.localGatewayRouteTableVirtualInterfaceGroupAssociationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala: Option[String] =
    Option(self.localGatewayVirtualInterfaceGroupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayRouteTableVirtualInterfaceGroupAssociationOps {

  implicit def toLocalGatewayRouteTableVirtualInterfaceGroupAssociationBuilderOps(
      v: LocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociationBuilderOps =
    new LocalGatewayRouteTableVirtualInterfaceGroupAssociationBuilderOps(v)

  implicit def toLocalGatewayRouteTableVirtualInterfaceGroupAssociationOps(
      v: LocalGatewayRouteTableVirtualInterfaceGroupAssociation
  ): LocalGatewayRouteTableVirtualInterfaceGroupAssociationOps =
    new LocalGatewayRouteTableVirtualInterfaceGroupAssociationOps(v)

}
