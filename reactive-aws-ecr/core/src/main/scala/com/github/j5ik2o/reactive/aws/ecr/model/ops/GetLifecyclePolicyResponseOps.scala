// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetLifecyclePolicyResponseBuilderOps(val self: GetLifecyclePolicyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): GetLifecyclePolicyResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): GetLifecyclePolicyResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala(value: Option[String]): GetLifecyclePolicyResponse.Builder = {
    value.fold(self) { v => self.lifecyclePolicyText(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedAtAsScala(value: Option[java.time.Instant]): GetLifecyclePolicyResponse.Builder = {
    value.fold(self) { v => self.lastEvaluatedAt(v) }
  }

}

final class GetLifecyclePolicyResponseOps(val self: GetLifecyclePolicyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedAtAsScala: Option[java.time.Instant] = Option(self.lastEvaluatedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLifecyclePolicyResponseOps {

  implicit def toGetLifecyclePolicyResponseBuilderOps(
      v: GetLifecyclePolicyResponse.Builder
  ): GetLifecyclePolicyResponseBuilderOps = new GetLifecyclePolicyResponseBuilderOps(v)

  implicit def toGetLifecyclePolicyResponseOps(v: GetLifecyclePolicyResponse): GetLifecyclePolicyResponseOps =
    new GetLifecyclePolicyResponseOps(v)

}
