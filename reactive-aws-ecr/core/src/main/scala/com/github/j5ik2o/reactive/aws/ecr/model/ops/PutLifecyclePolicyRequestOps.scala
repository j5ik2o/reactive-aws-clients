// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutLifecyclePolicyRequestBuilderOps(val self: PutLifecyclePolicyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): PutLifecyclePolicyRequest.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): PutLifecyclePolicyRequest.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala(value: Option[String]): PutLifecyclePolicyRequest.Builder = {
    value.fold(self) { v => self.lifecyclePolicyText(v) }
  }

}

final class PutLifecyclePolicyRequestOps(val self: PutLifecyclePolicyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLifecyclePolicyRequestOps {

  implicit def toPutLifecyclePolicyRequestBuilderOps(
      v: PutLifecyclePolicyRequest.Builder
  ): PutLifecyclePolicyRequestBuilderOps = new PutLifecyclePolicyRequestBuilderOps(v)

  implicit def toPutLifecyclePolicyRequestOps(v: PutLifecyclePolicyRequest): PutLifecyclePolicyRequestOps =
    new PutLifecyclePolicyRequestOps(v)

}
