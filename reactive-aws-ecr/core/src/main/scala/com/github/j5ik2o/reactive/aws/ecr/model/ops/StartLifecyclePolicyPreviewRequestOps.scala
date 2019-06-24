// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class StartLifecyclePolicyPreviewRequestBuilderOps(val self: StartLifecyclePolicyPreviewRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): StartLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): StartLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala(value: Option[String]): StartLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.lifecyclePolicyText(v)
    }
  }

}

final class StartLifecyclePolicyPreviewRequestOps(val self: StartLifecyclePolicyPreviewRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartLifecyclePolicyPreviewRequestOps {

  implicit def toStartLifecyclePolicyPreviewRequestBuilderOps(
      v: StartLifecyclePolicyPreviewRequest.Builder
  ): StartLifecyclePolicyPreviewRequestBuilderOps = new StartLifecyclePolicyPreviewRequestBuilderOps(v)

  implicit def toStartLifecyclePolicyPreviewRequestOps(
      v: StartLifecyclePolicyPreviewRequest
  ): StartLifecyclePolicyPreviewRequestOps = new StartLifecyclePolicyPreviewRequestOps(v)

}
