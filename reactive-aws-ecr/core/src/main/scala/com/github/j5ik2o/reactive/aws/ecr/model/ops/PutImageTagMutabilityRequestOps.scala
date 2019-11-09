// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageTagMutabilityRequestBuilderOps(val self: PutImageTagMutabilityRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): PutImageTagMutabilityRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): PutImageTagMutabilityRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagMutabilityAsScala(value: Option[ImageTagMutability]): PutImageTagMutabilityRequest.Builder = {
    value.fold(self) { v =>
      self.imageTagMutability(v)
    }
  }

}

final class PutImageTagMutabilityRequestOps(val self: PutImageTagMutabilityRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagMutabilityAsScala: Option[ImageTagMutability] = Option(self.imageTagMutability)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageTagMutabilityRequestOps {

  implicit def toPutImageTagMutabilityRequestBuilderOps(
      v: PutImageTagMutabilityRequest.Builder
  ): PutImageTagMutabilityRequestBuilderOps = new PutImageTagMutabilityRequestBuilderOps(v)

  implicit def toPutImageTagMutabilityRequestOps(v: PutImageTagMutabilityRequest): PutImageTagMutabilityRequestOps =
    new PutImageTagMutabilityRequestOps(v)

}
