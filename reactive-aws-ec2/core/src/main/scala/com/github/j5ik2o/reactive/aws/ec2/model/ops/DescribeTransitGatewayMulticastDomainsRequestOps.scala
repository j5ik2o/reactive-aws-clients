// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayMulticastDomainsRequestBuilderOps(
    val self: DescribeTransitGatewayMulticastDomainsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeTransitGatewayMulticastDomainsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.transitGatewayMulticastDomainIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewayMulticastDomainsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewayMulticastDomainsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayMulticastDomainsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayMulticastDomainsRequestOps(val self: DescribeTransitGatewayMulticastDomainsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdsAsScala: Option[Seq[String]] =
    Option(self.transitGatewayMulticastDomainIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayMulticastDomainsRequestOps {

  implicit def toDescribeTransitGatewayMulticastDomainsRequestBuilderOps(
      v: DescribeTransitGatewayMulticastDomainsRequest.Builder
  ): DescribeTransitGatewayMulticastDomainsRequestBuilderOps =
    new DescribeTransitGatewayMulticastDomainsRequestBuilderOps(v)

  implicit def toDescribeTransitGatewayMulticastDomainsRequestOps(
      v: DescribeTransitGatewayMulticastDomainsRequest
  ): DescribeTransitGatewayMulticastDomainsRequestOps = new DescribeTransitGatewayMulticastDomainsRequestOps(v)

}
