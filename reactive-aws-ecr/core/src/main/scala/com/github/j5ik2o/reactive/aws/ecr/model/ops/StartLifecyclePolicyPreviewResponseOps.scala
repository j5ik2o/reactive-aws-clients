// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class StartLifecyclePolicyPreviewResponseBuilderOps(val self: StartLifecyclePolicyPreviewResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.lifecyclePolicyText(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[LifecyclePolicyPreviewStatus]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class StartLifecyclePolicyPreviewResponseOps(val self: StartLifecyclePolicyPreviewResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[LifecyclePolicyPreviewStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartLifecyclePolicyPreviewResponseOps {

  implicit def toStartLifecyclePolicyPreviewResponseBuilderOps(
      v: StartLifecyclePolicyPreviewResponse.Builder
  ): StartLifecyclePolicyPreviewResponseBuilderOps = new StartLifecyclePolicyPreviewResponseBuilderOps(v)

  implicit def toStartLifecyclePolicyPreviewResponseOps(
      v: StartLifecyclePolicyPreviewResponse
  ): StartLifecyclePolicyPreviewResponseOps = new StartLifecyclePolicyPreviewResponseOps(v)

}
