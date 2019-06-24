// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class SetRepositoryPolicyRequestBuilderOps(val self: SetRepositoryPolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): SetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): SetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala(value: Option[String]): SetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyText(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala(value: Option[Boolean]): SetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class SetRepositoryPolicyRequestOps(val self: SetRepositoryPolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyTextAsScala: Option[String] = Option(self.policyText)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSetRepositoryPolicyRequestOps {

  implicit def toSetRepositoryPolicyRequestBuilderOps(
      v: SetRepositoryPolicyRequest.Builder
  ): SetRepositoryPolicyRequestBuilderOps = new SetRepositoryPolicyRequestBuilderOps(v)

  implicit def toSetRepositoryPolicyRequestOps(v: SetRepositoryPolicyRequest): SetRepositoryPolicyRequestOps =
    new SetRepositoryPolicyRequestOps(v)

}
