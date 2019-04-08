// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutRetentionPolicyResponseBuilderOps(val self: PutRetentionPolicyResponse.Builder) extends AnyVal {}

final class PutRetentionPolicyResponseOps(val self: PutRetentionPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRetentionPolicyResponseOps {

  implicit def toPutRetentionPolicyResponseBuilderOps(
      v: PutRetentionPolicyResponse.Builder
  ): PutRetentionPolicyResponseBuilderOps = new PutRetentionPolicyResponseBuilderOps(v)

  implicit def toPutRetentionPolicyResponseOps(v: PutRetentionPolicyResponse): PutRetentionPolicyResponseOps =
    new PutRetentionPolicyResponseOps(v)

}
