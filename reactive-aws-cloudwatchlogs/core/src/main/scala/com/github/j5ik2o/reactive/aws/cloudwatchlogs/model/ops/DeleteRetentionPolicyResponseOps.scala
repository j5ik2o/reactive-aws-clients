// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteRetentionPolicyResponseBuilderOps(val self: DeleteRetentionPolicyResponse.Builder) extends AnyVal {}

final class DeleteRetentionPolicyResponseOps(val self: DeleteRetentionPolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRetentionPolicyResponseOps {

  implicit def toDeleteRetentionPolicyResponseBuilderOps(
      v: DeleteRetentionPolicyResponse.Builder
  ): DeleteRetentionPolicyResponseBuilderOps = new DeleteRetentionPolicyResponseBuilderOps(v)

  implicit def toDeleteRetentionPolicyResponseOps(v: DeleteRetentionPolicyResponse): DeleteRetentionPolicyResponseOps =
    new DeleteRetentionPolicyResponseOps(v)

}
