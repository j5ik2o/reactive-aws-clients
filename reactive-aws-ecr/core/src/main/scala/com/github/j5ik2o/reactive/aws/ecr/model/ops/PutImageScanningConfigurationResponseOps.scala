// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class PutImageScanningConfigurationResponseBuilderOps(val self: PutImageScanningConfigurationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): PutImageScanningConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): PutImageScanningConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanningConfigurationAsScala(
      value: Option[ImageScanningConfiguration]
  ): PutImageScanningConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.imageScanningConfiguration(v)
    }
  }

}

final class PutImageScanningConfigurationResponseOps(val self: PutImageScanningConfigurationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanningConfigurationAsScala: Option[ImageScanningConfiguration] =
    Option(self.imageScanningConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutImageScanningConfigurationResponseOps {

  implicit def toPutImageScanningConfigurationResponseBuilderOps(
      v: PutImageScanningConfigurationResponse.Builder
  ): PutImageScanningConfigurationResponseBuilderOps = new PutImageScanningConfigurationResponseBuilderOps(v)

  implicit def toPutImageScanningConfigurationResponseOps(
      v: PutImageScanningConfigurationResponse
  ): PutImageScanningConfigurationResponseOps = new PutImageScanningConfigurationResponseOps(v)

}
