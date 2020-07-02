// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTableAssociationsResponseBuilderOps(
    val self: GetTransitGatewayRouteTableAssociationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala(
      value: Option[Seq[TransitGatewayRouteTableAssociation]]
  ): GetTransitGatewayRouteTableAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.associations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTableAssociationsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetTransitGatewayRouteTableAssociationsResponseOps(
    val self: GetTransitGatewayRouteTableAssociationsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala: Option[Seq[TransitGatewayRouteTableAssociation]] =
    Option(self.associations).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayRouteTableAssociationsResponseOps {

  implicit def toGetTransitGatewayRouteTableAssociationsResponseBuilderOps(
      v: GetTransitGatewayRouteTableAssociationsResponse.Builder
  ): GetTransitGatewayRouteTableAssociationsResponseBuilderOps =
    new GetTransitGatewayRouteTableAssociationsResponseBuilderOps(v)

  implicit def toGetTransitGatewayRouteTableAssociationsResponseOps(
      v: GetTransitGatewayRouteTableAssociationsResponse
  ): GetTransitGatewayRouteTableAssociationsResponseOps = new GetTransitGatewayRouteTableAssociationsResponseOps(v)

}
