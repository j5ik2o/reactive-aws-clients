// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTablePropagationsResponseBuilderOps(
    val self: GetTransitGatewayRouteTablePropagationsResponse.Builder
) extends AnyVal {

  final def transitGatewayRouteTablePropagationsAsScala(
      value: Option[Seq[TransitGatewayRouteTablePropagation]]
  ): GetTransitGatewayRouteTablePropagationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitGatewayRouteTablePropagations(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTablePropagationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetTransitGatewayRouteTablePropagationsResponseOps(
    val self: GetTransitGatewayRouteTablePropagationsResponse
) extends AnyVal {

  final def transitGatewayRouteTablePropagationsAsScala: Option[Seq[TransitGatewayRouteTablePropagation]] =
    Option(self.transitGatewayRouteTablePropagations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayRouteTablePropagationsResponseOps {

  implicit def toGetTransitGatewayRouteTablePropagationsResponseBuilderOps(
      v: GetTransitGatewayRouteTablePropagationsResponse.Builder
  ): GetTransitGatewayRouteTablePropagationsResponseBuilderOps =
    new GetTransitGatewayRouteTablePropagationsResponseBuilderOps(v)

  implicit def toGetTransitGatewayRouteTablePropagationsResponseOps(
      v: GetTransitGatewayRouteTablePropagationsResponse
  ): GetTransitGatewayRouteTablePropagationsResponseOps = new GetTransitGatewayRouteTablePropagationsResponseOps(v)

}
