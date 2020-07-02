// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeLogGroupsRequestBuilderOps(val self: DescribeLogGroupsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamePrefixAsScala(value: Option[String]): DescribeLogGroupsRequest.Builder = {
    value.fold(self) { v => self.logGroupNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLogGroupsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeLogGroupsRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

}

final class DescribeLogGroupsRequestOps(val self: DescribeLogGroupsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamePrefixAsScala: Option[String] = Option(self.logGroupNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLogGroupsRequestOps {

  implicit def toDescribeLogGroupsRequestBuilderOps(
      v: DescribeLogGroupsRequest.Builder
  ): DescribeLogGroupsRequestBuilderOps = new DescribeLogGroupsRequestBuilderOps(v)

  implicit def toDescribeLogGroupsRequestOps(v: DescribeLogGroupsRequest): DescribeLogGroupsRequestOps =
    new DescribeLogGroupsRequestOps(v)

}
