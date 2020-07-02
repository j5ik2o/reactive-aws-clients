// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteRepositoryPolicyResponseBuilderOps(val self: DeleteRepositoryPolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DeleteRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DeleteRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala(value: Option[String]): DeleteRepositoryPolicyResponse.Builder = {
    value.fold(self) { v => self.policyText(v) }
  }

}

final class DeleteRepositoryPolicyResponseOps(val self: DeleteRepositoryPolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala: Option[String] = Option(self.policyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRepositoryPolicyResponseOps {

  implicit def toDeleteRepositoryPolicyResponseBuilderOps(
      v: DeleteRepositoryPolicyResponse.Builder
  ): DeleteRepositoryPolicyResponseBuilderOps = new DeleteRepositoryPolicyResponseBuilderOps(v)

  implicit def toDeleteRepositoryPolicyResponseOps(
      v: DeleteRepositoryPolicyResponse
  ): DeleteRepositoryPolicyResponseOps = new DeleteRepositoryPolicyResponseOps(v)

}
