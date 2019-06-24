// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetLayerVersionPolicyResponseBuilderOps(val self: GetLayerVersionPolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala(value: Option[String]): GetLayerVersionPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): GetLayerVersionPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class GetLayerVersionPolicyResponseOps(val self: GetLayerVersionPolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala: Option[String] = Option(self.policy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLayerVersionPolicyResponseOps {

  implicit def toGetLayerVersionPolicyResponseBuilderOps(
      v: GetLayerVersionPolicyResponse.Builder
  ): GetLayerVersionPolicyResponseBuilderOps = new GetLayerVersionPolicyResponseBuilderOps(v)

  implicit def toGetLayerVersionPolicyResponseOps(v: GetLayerVersionPolicyResponse): GetLayerVersionPolicyResponseOps =
    new GetLayerVersionPolicyResponseOps(v)

}
