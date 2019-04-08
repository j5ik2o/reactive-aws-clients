// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkRequestBuilderOps(val self: DescribeVpcClassicLinkRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcClassicLinkRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def vpcIdsAsScala(value: Option[Seq[String]]): DescribeVpcClassicLinkRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcIds(v.asJava)
    }
  }

}

final class DescribeVpcClassicLinkRequestOps(val self: DescribeVpcClassicLinkRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdsAsScala: Option[Seq[String]] = Option(self.vpcIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcClassicLinkRequestOps {

  implicit def toDescribeVpcClassicLinkRequestBuilderOps(
      v: DescribeVpcClassicLinkRequest.Builder
  ): DescribeVpcClassicLinkRequestBuilderOps = new DescribeVpcClassicLinkRequestBuilderOps(v)

  implicit def toDescribeVpcClassicLinkRequestOps(v: DescribeVpcClassicLinkRequest): DescribeVpcClassicLinkRequestOps =
    new DescribeVpcClassicLinkRequestOps(v)

}
