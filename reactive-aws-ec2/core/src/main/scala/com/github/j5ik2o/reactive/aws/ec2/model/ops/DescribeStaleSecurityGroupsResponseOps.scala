// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeStaleSecurityGroupsResponseBuilderOps(val self: DescribeStaleSecurityGroupsResponse.Builder)
    extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeStaleSecurityGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def staleSecurityGroupSetAsScala(
      value: Option[Seq[StaleSecurityGroup]]
  ): DescribeStaleSecurityGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.staleSecurityGroupSet(v.asJava)
    }
  }

}

final class DescribeStaleSecurityGroupsResponseOps(val self: DescribeStaleSecurityGroupsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def staleSecurityGroupSetAsScala: Option[Seq[StaleSecurityGroup]] = Option(self.staleSecurityGroupSet).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStaleSecurityGroupsResponseOps {

  implicit def toDescribeStaleSecurityGroupsResponseBuilderOps(
      v: DescribeStaleSecurityGroupsResponse.Builder
  ): DescribeStaleSecurityGroupsResponseBuilderOps = new DescribeStaleSecurityGroupsResponseBuilderOps(v)

  implicit def toDescribeStaleSecurityGroupsResponseOps(
      v: DescribeStaleSecurityGroupsResponse
  ): DescribeStaleSecurityGroupsResponseOps = new DescribeStaleSecurityGroupsResponseOps(v)

}
