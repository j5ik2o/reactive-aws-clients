// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeEgressOnlyInternetGatewaysRequestBuilderOps(
    val self: DescribeEgressOnlyInternetGatewaysRequest.Builder
) extends AnyVal {

  final def egressOnlyInternetGatewayIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.egressOnlyInternetGatewayIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEgressOnlyInternetGatewaysRequestOps(val self: DescribeEgressOnlyInternetGatewaysRequest)
    extends AnyVal {

  final def egressOnlyInternetGatewayIdsAsScala: Option[Seq[String]] = Option(self.egressOnlyInternetGatewayIds).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEgressOnlyInternetGatewaysRequestOps {

  implicit def toDescribeEgressOnlyInternetGatewaysRequestBuilderOps(
      v: DescribeEgressOnlyInternetGatewaysRequest.Builder
  ): DescribeEgressOnlyInternetGatewaysRequestBuilderOps = new DescribeEgressOnlyInternetGatewaysRequestBuilderOps(v)

  implicit def toDescribeEgressOnlyInternetGatewaysRequestOps(
      v: DescribeEgressOnlyInternetGatewaysRequest
  ): DescribeEgressOnlyInternetGatewaysRequestOps = new DescribeEgressOnlyInternetGatewaysRequestOps(v)

}
