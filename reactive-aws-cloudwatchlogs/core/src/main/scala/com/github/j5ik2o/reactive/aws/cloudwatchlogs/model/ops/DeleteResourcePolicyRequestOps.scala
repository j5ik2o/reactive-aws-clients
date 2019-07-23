// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteResourcePolicyRequestBuilderOps(val self: DeleteResourcePolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala(value: Option[String]): DeleteResourcePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  }

}

final class DeleteResourcePolicyRequestOps(val self: DeleteResourcePolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala: Option[String] = Option(self.policyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteResourcePolicyRequestOps {

  implicit def toDeleteResourcePolicyRequestBuilderOps(
      v: DeleteResourcePolicyRequest.Builder
  ): DeleteResourcePolicyRequestBuilderOps = new DeleteResourcePolicyRequestBuilderOps(v)

  implicit def toDeleteResourcePolicyRequestOps(v: DeleteResourcePolicyRequest): DeleteResourcePolicyRequestOps =
    new DeleteResourcePolicyRequestOps(v)

}
