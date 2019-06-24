// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetDownloadUrlForLayerRequestBuilderOps(val self: GetDownloadUrlForLayerRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): GetDownloadUrlForLayerRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): GetDownloadUrlForLayerRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala(value: Option[String]): GetDownloadUrlForLayerRequest.Builder = {
    value.fold(self) { v =>
      self.layerDigest(v)
    }
  }

}

final class GetDownloadUrlForLayerRequestOps(val self: GetDownloadUrlForLayerRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDownloadUrlForLayerRequestOps {

  implicit def toGetDownloadUrlForLayerRequestBuilderOps(
      v: GetDownloadUrlForLayerRequest.Builder
  ): GetDownloadUrlForLayerRequestBuilderOps = new GetDownloadUrlForLayerRequestBuilderOps(v)

  implicit def toGetDownloadUrlForLayerRequestOps(v: GetDownloadUrlForLayerRequest): GetDownloadUrlForLayerRequestOps =
    new GetDownloadUrlForLayerRequestOps(v)

}
