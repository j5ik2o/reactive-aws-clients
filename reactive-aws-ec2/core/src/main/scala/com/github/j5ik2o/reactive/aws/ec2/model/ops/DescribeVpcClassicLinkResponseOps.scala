// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcClassicLinkResponseBuilderOps(val self: DescribeVpcClassicLinkResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcsAsScala(value: Option[Seq[VpcClassicLink]]): DescribeVpcClassicLinkResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcs(v.asJava)
    }
  }

}

final class DescribeVpcClassicLinkResponseOps(val self: DescribeVpcClassicLinkResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcsAsScala: Option[Seq[VpcClassicLink]] = Option(self.vpcs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcClassicLinkResponseOps {

  implicit def toDescribeVpcClassicLinkResponseBuilderOps(
      v: DescribeVpcClassicLinkResponse.Builder
  ): DescribeVpcClassicLinkResponseBuilderOps = new DescribeVpcClassicLinkResponseBuilderOps(v)

  implicit def toDescribeVpcClassicLinkResponseOps(
      v: DescribeVpcClassicLinkResponse
  ): DescribeVpcClassicLinkResponseOps = new DescribeVpcClassicLinkResponseOps(v)

}
