// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeRouteTablesRequestBuilderOps(val self: DescribeRouteTablesRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeRouteTablesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def routeTableIdsAsScala(value: Option[Seq[String]]): DescribeRouteTablesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routeTableIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeRouteTablesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeRouteTablesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeRouteTablesRequestOps(val self: DescribeRouteTablesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def routeTableIdsAsScala: Option[Seq[String]] = Option(self.routeTableIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRouteTablesRequestOps {

  implicit def toDescribeRouteTablesRequestBuilderOps(
      v: DescribeRouteTablesRequest.Builder
  ): DescribeRouteTablesRequestBuilderOps = new DescribeRouteTablesRequestBuilderOps(v)

  implicit def toDescribeRouteTablesRequestOps(v: DescribeRouteTablesRequest): DescribeRouteTablesRequestOps =
    new DescribeRouteTablesRequestOps(v)

}
