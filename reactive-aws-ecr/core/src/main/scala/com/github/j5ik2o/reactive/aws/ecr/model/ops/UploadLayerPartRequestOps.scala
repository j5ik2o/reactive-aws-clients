// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class UploadLayerPartRequestBuilderOps(val self: UploadLayerPartRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partFirstByteAsScala(value: Option[Long]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.partFirstByte(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partLastByteAsScala(value: Option[Long]): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.partLastByte(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerPartBlobAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): UploadLayerPartRequest.Builder = {
    value.fold(self) { v =>
      self.layerPartBlob(v)
    }
  }

}

final class UploadLayerPartRequestOps(val self: UploadLayerPartRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partFirstByteAsScala: Option[Long] = Option(self.partFirstByte)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partLastByteAsScala: Option[Long] = Option(self.partLastByte)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerPartBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.layerPartBlob)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadLayerPartRequestOps {

  implicit def toUploadLayerPartRequestBuilderOps(v: UploadLayerPartRequest.Builder): UploadLayerPartRequestBuilderOps =
    new UploadLayerPartRequestBuilderOps(v)

  implicit def toUploadLayerPartRequestOps(v: UploadLayerPartRequest): UploadLayerPartRequestOps =
    new UploadLayerPartRequestOps(v)

}
