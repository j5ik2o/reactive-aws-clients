// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayRouteTableVpcAssociationBuilderOps(val self: LocalGatewayRouteTableVpcAssociation.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdAsScala(
      value: Option[String]
  ): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.fold(self) { v => self.localGatewayRouteTableVpcAssociationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(value: Option[String]): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.fold(self) { v => self.localGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala(value: Option[String]): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.fold(self) { v => self.localGatewayId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): LocalGatewayRouteTableVpcAssociation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class LocalGatewayRouteTableVpcAssociationOps(val self: LocalGatewayRouteTableVpcAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdAsScala: Option[String] =
    Option(self.localGatewayRouteTableVpcAssociationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayRouteTableVpcAssociationOps {

  implicit def toLocalGatewayRouteTableVpcAssociationBuilderOps(
      v: LocalGatewayRouteTableVpcAssociation.Builder
  ): LocalGatewayRouteTableVpcAssociationBuilderOps = new LocalGatewayRouteTableVpcAssociationBuilderOps(v)

  implicit def toLocalGatewayRouteTableVpcAssociationOps(
      v: LocalGatewayRouteTableVpcAssociation
  ): LocalGatewayRouteTableVpcAssociationOps = new LocalGatewayRouteTableVpcAssociationOps(v)

}
