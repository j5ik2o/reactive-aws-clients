// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class SubscriptionFilterBuilderOps(val self: SubscriptionFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.filterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.filterPattern(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.destinationArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.roleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def distributionAsScala(value: Option[Distribution]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.distribution(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[Long]): SubscriptionFilter.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

}

final class SubscriptionFilterOps(val self: SubscriptionFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationArnAsScala: Option[String] = Option(self.destinationArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def distributionAsScala: Option[Distribution] = Option(self.distribution)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscriptionFilterOps {

  implicit def toSubscriptionFilterBuilderOps(v: SubscriptionFilter.Builder): SubscriptionFilterBuilderOps =
    new SubscriptionFilterBuilderOps(v)

  implicit def toSubscriptionFilterOps(v: SubscriptionFilter): SubscriptionFilterOps = new SubscriptionFilterOps(v)

}
