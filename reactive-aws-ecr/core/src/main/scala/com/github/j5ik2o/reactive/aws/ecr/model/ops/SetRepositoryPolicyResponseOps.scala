// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class SetRepositoryPolicyResponseBuilderOps(val self: SetRepositoryPolicyResponse.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def policyTextAsScala(value: Option[String]): SetRepositoryPolicyResponse.Builder = {
    value.fold(self) { v =>
      self.policyText(v)
    }
  }

}

final class SetRepositoryPolicyResponseOps(val self: SetRepositoryPolicyResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

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
