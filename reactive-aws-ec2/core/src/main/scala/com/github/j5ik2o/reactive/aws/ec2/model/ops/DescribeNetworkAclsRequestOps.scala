// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkAclsRequestBuilderOps(val self: DescribeNetworkAclsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeNetworkAclsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def networkAclIdsAsScala(value: Option[Seq[String]]): DescribeNetworkAclsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkAclIds(v.asJava)
    }
  }

}

final class DescribeNetworkAclsRequestOps(val self: DescribeNetworkAclsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkAclIdsAsScala: Option[Seq[String]] = Option(self.networkAclIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
