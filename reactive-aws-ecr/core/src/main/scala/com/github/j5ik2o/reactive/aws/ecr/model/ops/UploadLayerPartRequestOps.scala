// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class UploadLayerPartRequestBuilderOps(val self: UploadLayerPartRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def partFirstByteAsScala(value: Option[Long]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.partFirstByte(v)
    }
  }

  final def partLastByteAsScala(value: Option[Long]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.partLastByte(v)
    }
  }

  final def layerPartBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.layerPartBlob(v)
    }
  }

}

final class UploadLayerPartRequestOps(val self: UploadLayerPartRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def partFirstByteAsScala: Option[Long] = Option(self.partFirstByte)

  final def partLastByteAsScala: Option[Long] = Option(self.partLastByte)

  final def layerPartBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.layerPartBlob)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadLayerPartRequestOps {

  implicit def toUploadLayerPartRequestBuilderOps(v: UploadLayerPartRequest.Builder): UploadLayerPartRequestBuilderOps =
    new UploadLayerPartRequestBuilderOps(v)

  implicit def toUploadLayerPartRequestOps(v: UploadLayerPartRequest): UploadLayerPartRequestOps =
    new UploadLayerPartRequestOps(v)

}
