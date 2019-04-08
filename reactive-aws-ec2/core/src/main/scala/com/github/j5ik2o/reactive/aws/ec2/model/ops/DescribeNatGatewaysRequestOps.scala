// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNatGatewaysRequestBuilderOps(val self: DescribeNatGatewaysRequest.Builder) extends AnyVal {

  final def filterAsScala(value: Option[Seq[Filter]]): DescribeNatGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filter(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeNatGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def natGatewayIdsAsScala(value: Option[Seq[String]]): DescribeNatGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.natGatewayIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNatGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeNatGatewaysRequestOps(val self: DescribeNatGatewaysRequest) extends AnyVal {

  final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def natGatewayIdsAsScala: Option[Seq[String]] = Option(self.natGatewayIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNatGatewaysRequestOps {

  implicit def toDescribeNatGatewaysRequestBuilderOps(
      v: DescribeNatGatewaysRequest.Builder
  ): DescribeNatGatewaysRequestBuilderOps = new DescribeNatGatewaysRequestBuilderOps(v)

  implicit def toDescribeNatGatewaysRequestOps(v: DescribeNatGatewaysRequest): DescribeNatGatewaysRequestOps =
    new DescribeNatGatewaysRequestOps(v)

}
