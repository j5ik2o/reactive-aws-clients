// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkAclsRequestBuilderOps(val self: DescribeNetworkAclsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeNetworkAclsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdsAsScala(value: Option[Seq[String]]): DescribeNetworkAclsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkAclIds(v.asJava)
    }
  }

}

final class DescribeNetworkAclsRequestOps(val self: DescribeNetworkAclsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdsAsScala: Option[Seq[String]] = Option(self.networkAclIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkAclsRequestOps {

  implicit def toDescribeNetworkAclsRequestBuilderOps(
      v: DescribeNetworkAclsRequest.Builder
  ): DescribeNetworkAclsRequestBuilderOps = new DescribeNetworkAclsRequestBuilderOps(v)

  implicit def toDescribeNetworkAclsRequestOps(v: DescribeNetworkAclsRequest): DescribeNetworkAclsRequestOps =
    new DescribeNetworkAclsRequestOps(v)

}
