// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageScanningConfigurationRequestBuilderOps(val self: PutImageScanningConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): PutImageScanningConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): PutImageScanningConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanningConfigurationAsScala(
      value: Option[ImageScanningConfiguration]
  ): PutImageScanningConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.imageScanningConfiguration(v)
    }
  }

}

final class PutImageScanningConfigurationRequestOps(val self: PutImageScanningConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanningConfigurationAsScala: Option[ImageScanningConfiguration] =
    Option(self.imageScanningConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageScanningConfigurationRequestOps {

  implicit def toPutImageScanningConfigurationRequestBuilderOps(
      v: PutImageScanningConfigurationRequest.Builder
  ): PutImageScanningConfigurationRequestBuilderOps = new PutImageScanningConfigurationRequestBuilderOps(v)

  implicit def toPutImageScanningConfigurationRequestOps(
      v: PutImageScanningConfigurationRequest
  ): PutImageScanningConfigurationRequestOps = new PutImageScanningConfigurationRequestOps(v)

}
