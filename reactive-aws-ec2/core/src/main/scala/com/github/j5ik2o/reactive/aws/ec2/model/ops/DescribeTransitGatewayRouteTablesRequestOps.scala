// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayRouteTablesRequestBuilderOps(
    val self: DescribeTransitGatewayRouteTablesRequest.Builder
) extends AnyVal {

  final def transitGatewayRouteTableIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeTransitGatewayRouteTablesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitGatewayRouteTableIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewayRouteTablesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewayRouteTablesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayRouteTablesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayRouteTablesRequestOps(val self: DescribeTransitGatewayRouteTablesRequest)
    extends AnyVal {

  final def transitGatewayRouteTableIdsAsScala: Option[Seq[String]] = Option(self.transitGatewayRouteTableIds).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayRouteTablesRequestOps {

  implicit def toDescribeTransitGatewayRouteTablesRequestBuilderOps(
      v: DescribeTransitGatewayRouteTablesRequest.Builder
  ): DescribeTransitGatewayRouteTablesRequestBuilderOps = new DescribeTransitGatewayRouteTablesRequestBuilderOps(v)

  implicit def toDescribeTransitGatewayRouteTablesRequestOps(
      v: DescribeTransitGatewayRouteTablesRequest
  ): DescribeTransitGatewayRouteTablesRequestOps = new DescribeTransitGatewayRouteTablesRequestOps(v)

}
