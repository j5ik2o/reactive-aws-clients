// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeEgressOnlyInternetGatewaysRequestBuilderOps(
    val self: DescribeEgressOnlyInternetGatewaysRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.egressOnlyInternetGatewayIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeEgressOnlyInternetGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

}

final class DescribeEgressOnlyInternetGatewaysRequestOps(val self: DescribeEgressOnlyInternetGatewaysRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayIdsAsScala: Option[Seq[String]] =
    Option(self.egressOnlyInternetGatewayIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

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
