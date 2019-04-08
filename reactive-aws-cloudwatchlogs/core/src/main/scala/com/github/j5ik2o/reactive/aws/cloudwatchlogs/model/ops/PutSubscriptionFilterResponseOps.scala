// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutSubscriptionFilterResponseBuilderOps(val self: PutSubscriptionFilterResponse.Builder) extends AnyVal {}

final class PutSubscriptionFilterResponseOps(val self: PutSubscriptionFilterResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutSubscriptionFilterResponseOps {

  implicit def toPutSubscriptionFilterResponseBuilderOps(
      v: PutSubscriptionFilterResponse.Builder
  ): PutSubscriptionFilterResponseBuilderOps = new PutSubscriptionFilterResponseBuilderOps(v)

  implicit def toPutSubscriptionFilterResponseOps(v: PutSubscriptionFilterResponse): PutSubscriptionFilterResponseOps =
    new PutSubscriptionFilterResponseOps(v)

}
