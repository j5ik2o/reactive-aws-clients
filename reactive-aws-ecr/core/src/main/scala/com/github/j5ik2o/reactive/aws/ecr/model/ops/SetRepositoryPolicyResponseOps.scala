// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class SetRepositoryPolicyResponseBuilderOps(val self: SetRepositoryPolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.policyText(v) }
  }

}

final class SetRepositoryPolicyResponseOps(val self: SetRepositoryPolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala: Option[String] = Option(self.policyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetRepositoryPolicyResponseOps {

  implicit def toSetRepositoryPolicyResponseBuilderOps(
      v: SetRepositoryPolicyResponse.Builder
  ): SetRepositoryPolicyResponseBuilderOps = new SetRepositoryPolicyResponseBuilderOps(v)

  implicit def toSetRepositoryPolicyResponseOps(v: SetRepositoryPolicyResponse): SetRepositoryPolicyResponseOps =
    new SetRepositoryPolicyResponseOps(v)

}
