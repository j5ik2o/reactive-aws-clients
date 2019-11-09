// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class StartImageScanRequestBuilderOps(val self: StartImageScanRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): StartImageScanRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): StartImageScanRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[ImageIdentifier]): StartImageScanRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

}

final class StartImageScanRequestOps(val self: StartImageScanRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartImageScanRequestOps {

  implicit def toStartImageScanRequestBuilderOps(v: StartImageScanRequest.Builder): StartImageScanRequestBuilderOps =
    new StartImageScanRequestBuilderOps(v)

  implicit def toStartImageScanRequestOps(v: StartImageScanRequest): StartImageScanRequestOps =
    new StartImageScanRequestOps(v)

}
