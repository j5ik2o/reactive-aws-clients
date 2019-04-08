// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeRouteTablesResponseBuilderOps(val self: DescribeRouteTablesResponse.Builder) extends AnyVal {

  final def routeTablesAsScala(value: Option[Seq[RouteTable]]): DescribeRouteTablesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routeTables(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeRouteTablesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeRouteTablesResponseOps(val self: DescribeRouteTablesResponse) extends AnyVal {

  final def routeTablesAsScala: Option[Seq[RouteTable]] = Option(self.routeTables).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRouteTablesResponseOps {

  implicit def toDescribeRouteTablesResponseBuilderOps(
      v: DescribeRouteTablesResponse.Builder
  ): DescribeRouteTablesResponseBuilderOps = new DescribeRouteTablesResponseBuilderOps(v)

  implicit def toDescribeRouteTablesResponseOps(v: DescribeRouteTablesResponse): DescribeRouteTablesResponseOps =
    new DescribeRouteTablesResponseOps(v)

}
