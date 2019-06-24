// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteLifecyclePolicyRequestBuilderOps(val self: DeleteLifecyclePolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DeleteLifecyclePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DeleteLifecyclePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

}

final class DeleteLifecyclePolicyRequestOps(val self: DeleteLifecyclePolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLifecyclePolicyRequestOps {

  implicit def toDeleteLifecyclePolicyRequestBuilderOps(
      v: DeleteLifecyclePolicyRequest.Builder
  ): DeleteLifecyclePolicyRequestBuilderOps = new DeleteLifecyclePolicyRequestBuilderOps(v)

  implicit def toDeleteLifecyclePolicyRequestOps(v: DeleteLifecyclePolicyRequest): DeleteLifecyclePolicyRequestOps =
    new DeleteLifecyclePolicyRequestOps(v)

}
