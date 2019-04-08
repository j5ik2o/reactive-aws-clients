// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetTransitGatewayRouteTableAssociationsRequestBuilderOps(
    val self: GetTransitGatewayRouteTableAssociationsRequest.Builder
) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(
      value: Option[String]
  ): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetTransitGatewayRouteTableAssociationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetTransitGatewayRouteTableAssociationsRequestOps(val self: GetTransitGatewayRouteTableAssociationsRequest)
    extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTransitGatewayRouteTableAssociationsRequestOps {

  implicit def toGetTransitGatewayRouteTableAssociationsRequestBuilderOps(
      v: GetTransitGatewayRouteTableAssociationsRequest.Builder
  ): GetTransitGatewayRouteTableAssociationsRequestBuilderOps =
    new GetTransitGatewayRouteTableAssociationsRequestBuilderOps(v)

  implicit def toGetTransitGatewayRouteTableAssociationsRequestOps(
      v: GetTransitGatewayRouteTableAssociationsRequest
  ): GetTransitGatewayRouteTableAssociationsRequestOps = new GetTransitGatewayRouteTableAssociationsRequestOps(v)

}
