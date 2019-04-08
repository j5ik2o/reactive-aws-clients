// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutSubscriptionFilterRequestBuilderOps(val self: PutSubscriptionFilterRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def filterNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  }

  final def filterPatternAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  final def destinationArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.destinationArn(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def distributionAsScala(value: Option[Distribution]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.distribution(v)
    }
  }

}

final class PutSubscriptionFilterRequestOps(val self: PutSubscriptionFilterRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def filterNameAsScala: Option[String] = Option(self.filterName)

  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  final def destinationArnAsScala: Option[String] = Option(self.destinationArn)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def distributionAsScala: Option[Distribution] = Option(self.distribution)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutSubscriptionFilterRequestOps {

  implicit def toPutSubscriptionFilterRequestBuilderOps(
      v: PutSubscriptionFilterRequest.Builder
  ): PutSubscriptionFilterRequestBuilderOps = new PutSubscriptionFilterRequestBuilderOps(v)

  implicit def toPutSubscriptionFilterRequestOps(v: PutSubscriptionFilterRequest): PutSubscriptionFilterRequestOps =
    new PutSubscriptionFilterRequestOps(v)

}
