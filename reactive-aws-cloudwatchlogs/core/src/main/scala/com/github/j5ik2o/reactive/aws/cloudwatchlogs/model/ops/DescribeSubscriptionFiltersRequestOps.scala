// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeSubscriptionFiltersRequestBuilderOps(val self: DescribeSubscriptionFiltersRequest.Builder)
    extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterNamePrefixAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.filterNamePrefix(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def limitAsScala(value: Option[Int]): DescribeSubscriptionFiltersRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

}

final class DescribeSubscriptionFiltersRequestOps(val self: DescribeSubscriptionFiltersRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterNamePrefixAsScala: Option[String] = Option(self.filterNamePrefix) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

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
