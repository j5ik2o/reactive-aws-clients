// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class SubscriptionFilterBuilderOps(val self: SubscriptionFilter.Builder) extends AnyVal {

  final def filterNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  }

  final def logGroupNameAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def filterPatternAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  final def destinationArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.destinationArn(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def distributionAsScala(value: Option[Distribution]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.distribution(v)
    }
  }

  final def creationTimeAsScala(value: Option[Long]): SubscriptionFilter.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

}

final class SubscriptionFilterOps(val self: SubscriptionFilter) extends AnyVal {

  final def filterNameAsScala: Option[String] = Option(self.filterName)

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  final def destinationArnAsScala: Option[String] = Option(self.destinationArn)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def distributionAsScala: Option[Distribution] = Option(self.distribution)

  final def creationTimeAsScala: Option[Long] = Option(self.creationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscriptionFilterOps {

  implicit def toSubscriptionFilterBuilderOps(v: SubscriptionFilter.Builder): SubscriptionFilterBuilderOps =
    new SubscriptionFilterBuilderOps(v)

  implicit def toSubscriptionFilterOps(v: SubscriptionFilter): SubscriptionFilterOps = new SubscriptionFilterOps(v)

}
