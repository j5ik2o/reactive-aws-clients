// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteResourcePolicyResponseBuilderOps(val self: DeleteResourcePolicyResponse.Builder) extends AnyVal {}

final class DeleteResourcePolicyResponseOps(val self: DeleteResourcePolicyResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteResourcePolicyResponseOps {

  implicit def toDeleteResourcePolicyResponseBuilderOps(
      v: DeleteResourcePolicyResponse.Builder
  ): DeleteResourcePolicyResponseBuilderOps = new DeleteResourcePolicyResponseBuilderOps(v)

  implicit def toDeleteResourcePolicyResponseOps(v: DeleteResourcePolicyResponse): DeleteResourcePolicyResponseOps =
    new DeleteResourcePolicyResponseOps(v)

}
