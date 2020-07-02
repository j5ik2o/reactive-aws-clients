// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteRepositoryPolicyRequestBuilderOps(val self: DeleteRepositoryPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DeleteRepositoryPolicyRequest.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DeleteRepositoryPolicyRequest.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

}

final class DeleteRepositoryPolicyRequestOps(val self: DeleteRepositoryPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRepositoryPolicyRequestOps {

  implicit def toDeleteRepositoryPolicyRequestBuilderOps(
      v: DeleteRepositoryPolicyRequest.Builder
  ): DeleteRepositoryPolicyRequestBuilderOps = new DeleteRepositoryPolicyRequestBuilderOps(v)

  implicit def toDeleteRepositoryPolicyRequestOps(v: DeleteRepositoryPolicyRequest): DeleteRepositoryPolicyRequestOps =
    new DeleteRepositoryPolicyRequestOps(v)

}
