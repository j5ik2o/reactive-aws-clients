// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SearchTransitGatewayRoutesRequestBuilderOps(val self: SearchTransitGatewayRoutesRequest.Builder)
    extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): SearchTransitGatewayRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): SearchTransitGatewayRoutesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): SearchTransitGatewayRoutesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class SearchTransitGatewayRoutesRequestOps(val self: SearchTransitGatewayRoutesRequest) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchTransitGatewayRoutesRequestOps {

  implicit def toSearchTransitGatewayRoutesRequestBuilderOps(
      v: SearchTransitGatewayRoutesRequest.Builder
  ): SearchTransitGatewayRoutesRequestBuilderOps = new SearchTransitGatewayRoutesRequestBuilderOps(v)

  implicit def toSearchTransitGatewayRoutesRequestOps(
      v: SearchTransitGatewayRoutesRequest
  ): SearchTransitGatewayRoutesRequestOps = new SearchTransitGatewayRoutesRequestOps(v)

}
