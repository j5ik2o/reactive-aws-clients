// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeSubnetGroupsResponseBuilderOps(val self: DescribeSubnetGroupsResponse.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeSubnetGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def subnetGroupsAsScala(value: Option[Seq[SubnetGroup]]): DescribeSubnetGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetGroups(v.asJava)
    }
  }

}

final class DescribeSubnetGroupsResponseOps(val self: DescribeSubnetGroupsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def subnetGroupsAsScala: Option[Seq[SubnetGroup]] = Option(self.subnetGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetGroupsResponseOps {

  implicit def toDescribeSubnetGroupsResponseBuilderOps(
      v: DescribeSubnetGroupsResponse.Builder
  ): DescribeSubnetGroupsResponseBuilderOps = new DescribeSubnetGroupsResponseBuilderOps(v)

  implicit def toDescribeSubnetGroupsResponseOps(v: DescribeSubnetGroupsResponse): DescribeSubnetGroupsResponseOps =
    new DescribeSubnetGroupsResponseOps(v)

}
