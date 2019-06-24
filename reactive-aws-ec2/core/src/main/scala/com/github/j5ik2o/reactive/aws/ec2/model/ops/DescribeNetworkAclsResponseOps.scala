// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkAclsResponseBuilderOps(val self: DescribeNetworkAclsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclsAsScala(value: Option[Seq[NetworkAcl]]): DescribeNetworkAclsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkAcls(v.asJava)
    }
  }

}

final class DescribeNetworkAclsResponseOps(val self: DescribeNetworkAclsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclsAsScala: Option[Seq[NetworkAcl]] = Option(self.networkAcls).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkAclsResponseOps {

  implicit def toDescribeNetworkAclsResponseBuilderOps(
      v: DescribeNetworkAclsResponse.Builder
  ): DescribeNetworkAclsResponseBuilderOps = new DescribeNetworkAclsResponseBuilderOps(v)

  implicit def toDescribeNetworkAclsResponseOps(v: DescribeNetworkAclsResponse): DescribeNetworkAclsResponseOps =
    new DescribeNetworkAclsResponseOps(v)

}
