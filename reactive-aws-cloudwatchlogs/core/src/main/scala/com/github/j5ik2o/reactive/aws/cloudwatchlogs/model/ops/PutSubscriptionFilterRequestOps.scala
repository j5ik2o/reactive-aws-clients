// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutSubscriptionFilterRequestBuilderOps(val self: PutSubscriptionFilterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterPattern(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.destinationArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def distributionAsScala(value: Option[Distribution]): PutSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.distribution(v)
    }
  }

}

final class PutSubscriptionFilterRequestOps(val self: PutSubscriptionFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterPatternAsScala: Option[String] = Option(self.filterPattern)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationArnAsScala: Option[String] = Option(self.destinationArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
