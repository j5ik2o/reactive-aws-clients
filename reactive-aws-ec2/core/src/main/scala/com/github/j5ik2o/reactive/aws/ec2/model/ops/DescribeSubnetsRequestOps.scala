// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSubnetsRequestBuilderOps(val self: DescribeSubnetsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSubnetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): DescribeSubnetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

}

final class DescribeSubnetsRequestOps(val self: DescribeSubnetsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetsRequestOps {

  implicit def toDescribeSubnetsRequestBuilderOps(v: DescribeSubnetsRequest.Builder): DescribeSubnetsRequestBuilderOps =
    new DescribeSubnetsRequestBuilderOps(v)

  implicit def toDescribeSubnetsRequestOps(v: DescribeSubnetsRequest): DescribeSubnetsRequestOps =
    new DescribeSubnetsRequestOps(v)

}
