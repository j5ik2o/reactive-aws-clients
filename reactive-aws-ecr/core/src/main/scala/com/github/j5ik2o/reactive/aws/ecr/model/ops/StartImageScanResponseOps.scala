// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class StartImageScanResponseBuilderOps(val self: StartImageScanResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): StartImageScanResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): StartImageScanResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[ImageIdentifier]): StartImageScanResponse.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanStatusAsScala(value: Option[ImageScanStatus]): StartImageScanResponse.Builder = {
    value.fold(self) { v => self.imageScanStatus(v) }
  }

}

final class StartImageScanResponseOps(val self: StartImageScanResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanStatusAsScala: Option[ImageScanStatus] = Option(self.imageScanStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartImageScanResponseOps {

  implicit def toStartImageScanResponseBuilderOps(v: StartImageScanResponse.Builder): StartImageScanResponseBuilderOps =
    new StartImageScanResponseBuilderOps(v)

  implicit def toStartImageScanResponseOps(v: StartImageScanResponse): StartImageScanResponseOps =
    new StartImageScanResponseOps(v)

}
