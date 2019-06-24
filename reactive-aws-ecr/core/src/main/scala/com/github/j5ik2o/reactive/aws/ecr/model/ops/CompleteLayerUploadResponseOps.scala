// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class CompleteLayerUploadResponseBuilderOps(val self: CompleteLayerUploadResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): CompleteLayerUploadResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): CompleteLayerUploadResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): CompleteLayerUploadResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala(value: Option[String]): CompleteLayerUploadResponse.Builder = {
    value.fold(self) { v =>
      self.layerDigest(v)
    }
  }

}

final class CompleteLayerUploadResponseOps(val self: CompleteLayerUploadResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompleteLayerUploadResponseOps {

  implicit def toCompleteLayerUploadResponseBuilderOps(
      v: CompleteLayerUploadResponse.Builder
  ): CompleteLayerUploadResponseBuilderOps = new CompleteLayerUploadResponseBuilderOps(v)

  implicit def toCompleteLayerUploadResponseOps(v: CompleteLayerUploadResponse): CompleteLayerUploadResponseOps =
    new CompleteLayerUploadResponseOps(v)

}
