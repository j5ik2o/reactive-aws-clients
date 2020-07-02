// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeResourcePoliciesRequestBuilderOps(val self: DescribeResourcePoliciesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeResourcePoliciesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeResourcePoliciesRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

}

final class DescribeResourcePoliciesRequestOps(val self: DescribeResourcePoliciesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeResourcePoliciesRequestOps {

  implicit def toDescribeResourcePoliciesRequestBuilderOps(
      v: DescribeResourcePoliciesRequest.Builder
  ): DescribeResourcePoliciesRequestBuilderOps = new DescribeResourcePoliciesRequestBuilderOps(v)

  implicit def toDescribeResourcePoliciesRequestOps(
      v: DescribeResourcePoliciesRequest
  ): DescribeResourcePoliciesRequestOps = new DescribeResourcePoliciesRequestOps(v)

}
