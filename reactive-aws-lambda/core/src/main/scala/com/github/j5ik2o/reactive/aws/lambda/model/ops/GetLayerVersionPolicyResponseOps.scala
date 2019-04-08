// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionPolicyResponseBuilderOps(val self: GetLayerVersionPolicyResponse.Builder) extends AnyVal {

  final def policyAsScala(value: Option[String]): GetLayerVersionPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): GetLayerVersionPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class GetLayerVersionPolicyResponseOps(val self: GetLayerVersionPolicyResponse) extends AnyVal {

  final def policyAsScala: Option[String] = Option(self.policy) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionPolicyResponseOps {

  implicit def toGetLayerVersionPolicyResponseBuilderOps(
      v: GetLayerVersionPolicyResponse.Builder
  ): GetLayerVersionPolicyResponseBuilderOps = new GetLayerVersionPolicyResponseBuilderOps(v)

  implicit def toGetLayerVersionPolicyResponseOps(v: GetLayerVersionPolicyResponse): GetLayerVersionPolicyResponseOps =
    new GetLayerVersionPolicyResponseOps(v)

}
