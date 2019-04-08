// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteSubscriptionFilterResponseBuilderOps(val self: DeleteSubscriptionFilterResponse.Builder)
    extends AnyVal {}

final class DeleteSubscriptionFilterResponseOps(val self: DeleteSubscriptionFilterResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSubscriptionFilterResponseOps {

  implicit def toDeleteSubscriptionFilterResponseBuilderOps(
      v: DeleteSubscriptionFilterResponse.Builder
  ): DeleteSubscriptionFilterResponseBuilderOps = new DeleteSubscriptionFilterResponseBuilderOps(v)

  implicit def toDeleteSubscriptionFilterResponseOps(
      v: DeleteSubscriptionFilterResponse
  ): DeleteSubscriptionFilterResponseOps = new DeleteSubscriptionFilterResponseOps(v)

}
