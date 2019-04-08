// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetRepositoryPolicyResponseBuilderOps(val self: GetRepositoryPolicyResponse.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): GetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): GetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def policyTextAsScala(value: Option[String]): GetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policyText(v)
    }
  }

}

final class GetRepositoryPolicyResponseOps(val self: GetRepositoryPolicyResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def policyTextAsScala: Option[String] = Option(self.policyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRepositoryPolicyResponseOps {

  implicit def toGetRepositoryPolicyResponseBuilderOps(
      v: GetRepositoryPolicyResponse.Builder
  ): GetRepositoryPolicyResponseBuilderOps = new GetRepositoryPolicyResponseBuilderOps(v)

  implicit def toGetRepositoryPolicyResponseOps(v: GetRepositoryPolicyResponse): GetRepositoryPolicyResponseOps =
    new GetRepositoryPolicyResponseOps(v)

}
