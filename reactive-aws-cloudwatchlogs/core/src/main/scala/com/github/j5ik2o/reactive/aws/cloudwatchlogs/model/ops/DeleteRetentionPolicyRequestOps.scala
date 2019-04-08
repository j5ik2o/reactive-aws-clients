// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DeleteRetentionPolicyRequestBuilderOps(val self: DeleteRetentionPolicyRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): DeleteRetentionPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

}

final class DeleteRetentionPolicyRequestOps(val self: DeleteRetentionPolicyRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRetentionPolicyRequestOps {

  implicit def toDeleteRetentionPolicyRequestBuilderOps(
      v: DeleteRetentionPolicyRequest.Builder
  ): DeleteRetentionPolicyRequestBuilderOps = new DeleteRetentionPolicyRequestBuilderOps(v)

  implicit def toDeleteRetentionPolicyRequestOps(v: DeleteRetentionPolicyRequest): DeleteRetentionPolicyRequestOps =
    new DeleteRetentionPolicyRequestOps(v)

}
