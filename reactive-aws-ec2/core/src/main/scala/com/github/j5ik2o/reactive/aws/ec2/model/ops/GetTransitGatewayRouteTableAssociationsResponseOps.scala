// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTableAssociationsResponseBuilderOps(
    val self: GetTransitGatewayRouteTableAssociationsResponse.Builder
) extends AnyVal {

  final def associationsAsScala(
      value: Option[Seq[TransitGatewayRouteTableAssociation]]
  ): GetTransitGatewayRouteTableAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.associations(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTableAssociationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetTransitGatewayRouteTableAssociationsResponseOps(
    val self: GetTransitGatewayRouteTableAssociationsResponse
) extends AnyVal {

  final def associationsAsScala: Option[Seq[TransitGatewayRouteTableAssociation]] = Option(self.associations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
