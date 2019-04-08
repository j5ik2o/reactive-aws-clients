// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutResourcePolicyRequestBuilderOps(val self: PutResourcePolicyRequest.Builder) extends AnyVal {

  final def policyNameAsScala(value: Option[String]): PutResourcePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  } // String

  final def policyDocumentAsScala(value: Option[String]): PutResourcePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  } // String

}

final class PutResourcePolicyRequestOps(val self: PutResourcePolicyRequest) extends AnyVal {

  final def policyNameAsScala: Option[String] = Option(self.policyName) // String

  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutResourcePolicyRequestOps {

  implicit def toPutResourcePolicyRequestBuilderOps(
      v: PutResourcePolicyRequest.Builder
  ): PutResourcePolicyRequestBuilderOps = new PutResourcePolicyRequestBuilderOps(v)

  implicit def toPutResourcePolicyRequestOps(v: PutResourcePolicyRequest): PutResourcePolicyRequestOps =
    new PutResourcePolicyRequestOps(v)

}
