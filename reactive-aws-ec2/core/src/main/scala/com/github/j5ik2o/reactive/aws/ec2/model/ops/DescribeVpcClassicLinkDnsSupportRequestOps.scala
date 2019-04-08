// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkDnsSupportRequestBuilderOps(val self: DescribeVpcClassicLinkDnsSupportRequest.Builder)
    extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def vpcIdsAsScala(value: Option[Seq[String]]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcIds(v.asJava)
    }
  }

}

final class DescribeVpcClassicLinkDnsSupportRequestOps(val self: DescribeVpcClassicLinkDnsSupportRequest)
    extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def vpcIdsAsScala: Option[Seq[String]] = Option(self.vpcIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcClassicLinkDnsSupportRequestOps {

  implicit def toDescribeVpcClassicLinkDnsSupportRequestBuilderOps(
      v: DescribeVpcClassicLinkDnsSupportRequest.Builder
  ): DescribeVpcClassicLinkDnsSupportRequestBuilderOps = new DescribeVpcClassicLinkDnsSupportRequestBuilderOps(v)

  implicit def toDescribeVpcClassicLinkDnsSupportRequestOps(
      v: DescribeVpcClassicLinkDnsSupportRequest
  ): DescribeVpcClassicLinkDnsSupportRequestOps = new DescribeVpcClassicLinkDnsSupportRequestOps(v)

}
