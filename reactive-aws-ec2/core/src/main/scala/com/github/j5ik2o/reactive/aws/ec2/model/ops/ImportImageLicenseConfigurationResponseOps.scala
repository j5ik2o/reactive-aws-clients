// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageLicenseConfigurationResponseBuilderOps(val self: ImportImageLicenseConfigurationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala(value: Option[String]): ImportImageLicenseConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.licenseConfigurationArn(v)
    }
  }

}

final class ImportImageLicenseConfigurationResponseOps(val self: ImportImageLicenseConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageLicenseConfigurationResponseOps {

  implicit def toImportImageLicenseConfigurationResponseBuilderOps(
      v: ImportImageLicenseConfigurationResponse.Builder
  ): ImportImageLicenseConfigurationResponseBuilderOps = new ImportImageLicenseConfigurationResponseBuilderOps(v)

  implicit def toImportImageLicenseConfigurationResponseOps(
      v: ImportImageLicenseConfigurationResponse
  ): ImportImageLicenseConfigurationResponseOps = new ImportImageLicenseConfigurationResponseOps(v)

}
