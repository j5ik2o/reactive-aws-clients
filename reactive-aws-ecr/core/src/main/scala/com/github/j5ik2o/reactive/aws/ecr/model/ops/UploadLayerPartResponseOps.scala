// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class UploadLayerPartResponseBuilderOps(val self: UploadLayerPartResponse.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def lastByteReceivedAsScala(value: Option[Long]): UploadLayerPartResponse.Builder = {
    value.fold(self) { v =>
      self.lastByteReceived(v)
    }
  }

}

final class UploadLayerPartResponseOps(val self: UploadLayerPartResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

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
