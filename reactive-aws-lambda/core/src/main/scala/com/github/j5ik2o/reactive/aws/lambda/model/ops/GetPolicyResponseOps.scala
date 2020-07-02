// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetPolicyResponseBuilderOps(val self: GetPolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala(value: Option[String]): GetPolicyResponse.Builder = {
    value.fold(self) { v => self.policy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): GetPolicyResponse.Builder = {
    value.fold(self) { v => self.revisionId(v) }
  }

}

final class GetPolicyResponseOps(val self: GetPolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala: Option[String] = Option(self.policy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPolicyResponseOps {

  implicit def toGetPolicyResponseBuilderOps(v: GetPolicyResponse.Builder): GetPolicyResponseBuilderOps =
    new GetPolicyResponseBuilderOps(v)

  implicit def toGetPolicyResponseOps(v: GetPolicyResponse): GetPolicyResponseOps = new GetPolicyResponseOps(v)

}
