// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeSubnetGroupsResponseBuilderOps(val self: DescribeSubnetGroupsResponse.Builder) extends AnyVal {

  final def withNextTokenAsScala(value: Option[String]): DescribeSubnetGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withSubnetGroupsAsScala(value: Option[Seq[SubnetGroup]]): DescribeSubnetGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetGroups(v.asJava)
    } // Seq[SubnetGroup]
  }

}

final class DescribeSubnetGroupsResponseOps(val self: DescribeSubnetGroupsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def subnetGroupsAsScala: Option[Seq[SubnetGroup]] = Option(self.subnetGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SubnetGroup]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetGroupsResponseOps {

  implicit def toDescribeSubnetGroupsResponseBuilderOps(
      v: DescribeSubnetGroupsResponse.Builder
  ): DescribeSubnetGroupsResponseBuilderOps = new DescribeSubnetGroupsResponseBuilderOps(v)

  implicit def toDescribeSubnetGroupsResponseOps(v: DescribeSubnetGroupsResponse): DescribeSubnetGroupsResponseOps =
    new DescribeSubnetGroupsResponseOps(v)

}
