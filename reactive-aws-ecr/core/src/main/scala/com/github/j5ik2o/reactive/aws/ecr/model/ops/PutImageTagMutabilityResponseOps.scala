// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageTagMutabilityResponseBuilderOps(val self: PutImageTagMutabilityResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): PutImageTagMutabilityResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): PutImageTagMutabilityResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagMutabilityAsScala(value: Option[ImageTagMutability]): PutImageTagMutabilityResponse.Builder = {
    value.fold(self) { v => self.imageTagMutability(v) }
  }

}

final class PutImageTagMutabilityResponseOps(val self: PutImageTagMutabilityResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagMutabilityAsScala: Option[ImageTagMutability] = Option(self.imageTagMutability)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageTagMutabilityResponseOps {

  implicit def toPutImageTagMutabilityResponseBuilderOps(
      v: PutImageTagMutabilityResponse.Builder
  ): PutImageTagMutabilityResponseBuilderOps = new PutImageTagMutabilityResponseBuilderOps(v)

  implicit def toPutImageTagMutabilityResponseOps(v: PutImageTagMutabilityResponse): PutImageTagMutabilityResponseOps =
    new PutImageTagMutabilityResponseOps(v)

}
