// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSecurityGroupsResponseBuilderOps(val self: DescribeSecurityGroupsResponse.Builder) extends AnyVal {

  final def securityGroupsAsScala(value: Option[Seq[SecurityGroup]]): DescribeSecurityGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSecurityGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeSecurityGroupsResponseOps(val self: DescribeSecurityGroupsResponse) extends AnyVal {

  final def securityGroupsAsScala: Option[Seq[SecurityGroup]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSecurityGroupsResponseOps {

  implicit def toDescribeSecurityGroupsResponseBuilderOps(
      v: DescribeSecurityGroupsResponse.Builder
  ): DescribeSecurityGroupsResponseBuilderOps = new DescribeSecurityGroupsResponseBuilderOps(v)

  implicit def toDescribeSecurityGroupsResponseOps(
      v: DescribeSecurityGroupsResponse
  ): DescribeSecurityGroupsResponseOps = new DescribeSecurityGroupsResponseOps(v)

}
