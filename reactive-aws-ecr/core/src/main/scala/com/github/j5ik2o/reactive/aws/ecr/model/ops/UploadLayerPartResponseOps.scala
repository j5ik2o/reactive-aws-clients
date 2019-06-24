// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class UploadLayerPartResponseBuilderOps(val self: UploadLayerPartResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastByteReceivedAsScala(value: Option[Long]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.lastByteReceived(v)
    }
  }

}

final class UploadLayerPartResponseOps(val self: UploadLayerPartResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastByteReceivedAsScala: Option[Long] = Option(self.lastByteReceived)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadLayerPartResponseOps {

  implicit def toUploadLayerPartResponseBuilderOps(
      v: UploadLayerPartResponse.Builder
  ): UploadLayerPartResponseBuilderOps = new UploadLayerPartResponseBuilderOps(v)

  implicit def toUploadLayerPartResponseOps(v: UploadLayerPartResponse): UploadLayerPartResponseOps =
    new UploadLayerPartResponseOps(v)

}
