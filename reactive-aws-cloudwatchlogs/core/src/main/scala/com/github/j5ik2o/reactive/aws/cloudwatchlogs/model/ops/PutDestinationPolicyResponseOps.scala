// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutDestinationPolicyResponseBuilderOps(val self: PutDestinationPolicyResponse.Builder) extends AnyVal {}

final class PutDestinationPolicyResponseOps(val self: PutDestinationPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutDestinationPolicyResponseOps {

  implicit def toPutDestinationPolicyResponseBuilderOps(
      v: PutDestinationPolicyResponse.Builder
  ): PutDestinationPolicyResponseBuilderOps = new PutDestinationPolicyResponseBuilderOps(v)

  implicit def toPutDestinationPolicyResponseOps(v: PutDestinationPolicyResponse): PutDestinationPolicyResponseOps =
    new PutDestinationPolicyResponseOps(v)

}
