// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutSubscriptionFilterRequestBuilderOps(val self: PutSubscriptionFilterRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def filterNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  } // String

  final def filterPatternAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  } // String

  final def destinationArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.destinationArn(v)
    }
  } // String

  final def roleArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  } // String

  final def distributionAsScala(value: Option[Distribution]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.distribution(v)
    }
  } // Distribution

}

final class PutSubscriptionFilterRequestOps(val self: PutSubscriptionFilterRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def filterNameAsScala: Option[String] = Option(self.filterName) // String

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern) // String

  final def destinationArnAsScala: Option[String] = Option(self.destinationArn) // String

  final def roleArnAsScala: Option[String] = Option(self.roleArn) // String

  final def distributionAsScala: Option[Distribution] = Option(self.distribution) // Distribution

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutSubscriptionFilterRequestOps {

  implicit def toPutSubscriptionFilterRequestBuilderOps(
      v: PutSubscriptionFilterRequest.Builder
  ): PutSubscriptionFilterRequestBuilderOps = new PutSubscriptionFilterRequestBuilderOps(v)

  implicit def toPutSubscriptionFilterRequestOps(v: PutSubscriptionFilterRequest): PutSubscriptionFilterRequestOps =
    new PutSubscriptionFilterRequestOps(v)

}
