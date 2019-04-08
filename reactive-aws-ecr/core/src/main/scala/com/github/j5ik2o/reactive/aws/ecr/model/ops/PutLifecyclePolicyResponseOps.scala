// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutLifecyclePolicyResponseBuilderOps(val self: PutLifecyclePolicyResponse.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): PutLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): PutLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def lifecyclePolicyTextAsScala(value: Option[String]): PutLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.lifecyclePolicyText(v)
    }
  }

}

final class PutLifecyclePolicyResponseOps(val self: PutLifecyclePolicyResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLifecyclePolicyResponseOps {

  implicit def toPutLifecyclePolicyResponseBuilderOps(
      v: PutLifecyclePolicyResponse.Builder
  ): PutLifecyclePolicyResponseBuilderOps = new PutLifecyclePolicyResponseBuilderOps(v)

  implicit def toPutLifecyclePolicyResponseOps(v: PutLifecyclePolicyResponse): PutLifecyclePolicyResponseOps =
    new PutLifecyclePolicyResponseOps(v)

}
