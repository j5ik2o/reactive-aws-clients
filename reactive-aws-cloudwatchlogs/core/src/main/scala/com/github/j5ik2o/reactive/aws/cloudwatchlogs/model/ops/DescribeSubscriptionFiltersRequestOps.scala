// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeSubscriptionFiltersRequestBuilderOps(val self: DescribeSubscriptionFiltersRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNamePrefixAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v => self.filterNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

}

final class DescribeSubscriptionFiltersRequestOps(val self: DescribeSubscriptionFiltersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNamePrefixAsScala: Option[String] = Option(self.filterNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubscriptionFiltersRequestOps {

  implicit def toDescribeSubscriptionFiltersRequestBuilderOps(
      v: DescribeSubscriptionFiltersRequest.Builder
  ): DescribeSubscriptionFiltersRequestBuilderOps = new DescribeSubscriptionFiltersRequestBuilderOps(v)

  implicit def toDescribeSubscriptionFiltersRequestOps(
      v: DescribeSubscriptionFiltersRequest
  ): DescribeSubscriptionFiltersRequestOps = new DescribeSubscriptionFiltersRequestOps(v)

}
