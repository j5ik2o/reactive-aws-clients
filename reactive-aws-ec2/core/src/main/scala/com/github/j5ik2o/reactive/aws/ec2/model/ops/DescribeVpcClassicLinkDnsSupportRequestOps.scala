// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkDnsSupportRequestBuilderOps(val self: DescribeVpcClassicLinkDnsSupportRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdsAsScala(value: Option[Seq[String]]): DescribeVpcClassicLinkDnsSupportRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcIds(v.asJava)
    }
  }

}

final class DescribeVpcClassicLinkDnsSupportRequestOps(val self: DescribeVpcClassicLinkDnsSupportRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdsAsScala: Option[Seq[String]] = Option(self.vpcIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
