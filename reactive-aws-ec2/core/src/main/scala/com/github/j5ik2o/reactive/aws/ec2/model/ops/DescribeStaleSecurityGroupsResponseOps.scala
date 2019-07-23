// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeStaleSecurityGroupsResponseBuilderOps(val self: DescribeStaleSecurityGroupsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeStaleSecurityGroupsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleSecurityGroupSetAsScala(
      value: Option[Seq[StaleSecurityGroup]]
  ): DescribeStaleSecurityGroupsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.staleSecurityGroupSet(v.asJava)
    }
  }

}

final class DescribeStaleSecurityGroupsResponseOps(val self: DescribeStaleSecurityGroupsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleSecurityGroupSetAsScala: Option[Seq[StaleSecurityGroup]] = Option(self.staleSecurityGroupSet).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
