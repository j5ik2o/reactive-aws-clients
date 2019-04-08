// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class SubscriptionFilterBuilderOps(val self: SubscriptionFilter.Builder) extends AnyVal {

  final def filterNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  } // String

  final def logGroupNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterPatternAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  } // String

  final def destinationArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.destinationArn(v)
    }
  } // String

  final def roleArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  } // String

  final def distributionAsScala(value: Option[Distribution]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.distribution(v)
    }
  } // Distribution

  final def creationTimeAsScala(value: Option[Long]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Long

}

final class SubscriptionFilterOps(val self: SubscriptionFilter) extends AnyVal {

  final def filterNameAsScala: Option[String] = Option(self.filterName) // String

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern) // String

  final def destinationArnAsScala: Option[String] = Option(self.destinationArn) // String

  final def roleArnAsScala: Option[String] = Option(self.roleArn) // String

  final def distributionAsScala: Option[Distribution] = Option(self.distribution) // Distribution

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscriptionFilterOps {

  implicit def toSubscriptionFilterBuilderOps(v: SubscriptionFilter.Builder): SubscriptionFilterBuilderOps =
    new SubscriptionFilterBuilderOps(v)

  implicit def toSubscriptionFilterOps(v: SubscriptionFilter): SubscriptionFilterOps = new SubscriptionFilterOps(v)

}
