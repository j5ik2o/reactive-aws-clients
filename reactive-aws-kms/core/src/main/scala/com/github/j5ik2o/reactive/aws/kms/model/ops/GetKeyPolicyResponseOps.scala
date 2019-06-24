// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetKeyPolicyResponseBuilderOps(val self: GetKeyPolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala(value: Option[String]): GetKeyPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

}

final class GetKeyPolicyResponseOps(val self: GetKeyPolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala: Option[String] = Option(self.policy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetKeyPolicyResponseOps {

  implicit def toGetKeyPolicyResponseBuilderOps(v: GetKeyPolicyResponse.Builder): GetKeyPolicyResponseBuilderOps =
    new GetKeyPolicyResponseBuilderOps(v)

  implicit def toGetKeyPolicyResponseOps(v: GetKeyPolicyResponse): GetKeyPolicyResponseOps =
    new GetKeyPolicyResponseOps(v)

}
