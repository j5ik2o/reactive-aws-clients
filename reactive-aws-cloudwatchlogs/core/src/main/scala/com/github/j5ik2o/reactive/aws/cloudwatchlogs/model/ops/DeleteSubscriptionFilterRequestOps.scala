// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteSubscriptionFilterRequestBuilderOps(val self: DeleteSubscriptionFilterRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): DeleteSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala(value: Option[String]): DeleteSubscriptionFilterRequest.Builder = {
    value.fold(self) { v =>
      self.filterName(v)
    }
  }

}

final class DeleteSubscriptionFilterRequestOps(val self: DeleteSubscriptionFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterNameAsScala: Option[String] = Option(self.filterName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSubscriptionFilterRequestOps {

  implicit def toDeleteSubscriptionFilterRequestBuilderOps(
      v: DeleteSubscriptionFilterRequest.Builder
  ): DeleteSubscriptionFilterRequestBuilderOps = new DeleteSubscriptionFilterRequestBuilderOps(v)

  implicit def toDeleteSubscriptionFilterRequestOps(
      v: DeleteSubscriptionFilterRequest
  ): DeleteSubscriptionFilterRequestOps = new DeleteSubscriptionFilterRequestOps(v)

}
