// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeSubscriptionFiltersResponseBuilderOps(val self: DescribeSubscriptionFiltersResponse.Builder)
    extends AnyVal {

  final def subscriptionFiltersAsScala(
      value: Option[Seq[SubscriptionFilter]]
  ): DescribeSubscriptionFiltersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subscriptionFilters(v.asJava)
    } // Seq[SubscriptionFilter]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSubscriptionFiltersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeSubscriptionFiltersResponseOps(val self: DescribeSubscriptionFiltersResponse) extends AnyVal {

  final def subscriptionFiltersAsScala: Option[Seq[SubscriptionFilter]] = Option(self.subscriptionFilters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SubscriptionFilter]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubscriptionFiltersResponseOps {

  implicit def toDescribeSubscriptionFiltersResponseBuilderOps(
      v: DescribeSubscriptionFiltersResponse.Builder
  ): DescribeSubscriptionFiltersResponseBuilderOps = new DescribeSubscriptionFiltersResponseBuilderOps(v)

  implicit def toDescribeSubscriptionFiltersResponseOps(
      v: DescribeSubscriptionFiltersResponse
  ): DescribeSubscriptionFiltersResponseOps = new DescribeSubscriptionFiltersResponseOps(v)

}
