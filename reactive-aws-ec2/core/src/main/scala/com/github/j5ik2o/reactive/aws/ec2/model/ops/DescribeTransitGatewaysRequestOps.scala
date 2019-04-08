// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewaysRequestBuilderOps(val self: DescribeTransitGatewaysRequest.Builder) extends AnyVal {

  final def transitGatewayIdsAsScala(value: Option[Seq[String]]): DescribeTransitGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitGatewayIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewaysRequestOps(val self: DescribeTransitGatewaysRequest) extends AnyVal {

  final def transitGatewayIdsAsScala: Option[Seq[String]] = Option(self.transitGatewayIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewaysRequestOps {

  implicit def toDescribeTransitGatewaysRequestBuilderOps(
      v: DescribeTransitGatewaysRequest.Builder
  ): DescribeTransitGatewaysRequestBuilderOps = new DescribeTransitGatewaysRequestBuilderOps(v)

  implicit def toDescribeTransitGatewaysRequestOps(
      v: DescribeTransitGatewaysRequest
  ): DescribeTransitGatewaysRequestOps = new DescribeTransitGatewaysRequestOps(v)

}
