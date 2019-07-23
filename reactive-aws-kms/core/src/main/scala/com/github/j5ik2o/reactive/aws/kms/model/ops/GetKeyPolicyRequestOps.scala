// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetKeyPolicyRequestBuilderOps(val self: GetKeyPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GetKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala(value: Option[String]): GetKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  }

}

final class GetKeyPolicyRequestOps(val self: GetKeyPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNameAsScala: Option[String] = Option(self.policyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetKeyPolicyRequestOps {

  implicit def toGetKeyPolicyRequestBuilderOps(v: GetKeyPolicyRequest.Builder): GetKeyPolicyRequestBuilderOps =
    new GetKeyPolicyRequestBuilderOps(v)

  implicit def toGetKeyPolicyRequestOps(v: GetKeyPolicyRequest): GetKeyPolicyRequestOps = new GetKeyPolicyRequestOps(v)

}
