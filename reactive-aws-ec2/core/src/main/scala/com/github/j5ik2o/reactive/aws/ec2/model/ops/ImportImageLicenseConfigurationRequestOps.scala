// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageLicenseConfigurationRequestBuilderOps(val self: ImportImageLicenseConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala(value: Option[String]): ImportImageLicenseConfigurationRequest.Builder = {
    value.fold(self) { v => self.licenseConfigurationArn(v) }
  }

}

final class ImportImageLicenseConfigurationRequestOps(val self: ImportImageLicenseConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageLicenseConfigurationRequestOps {

  implicit def toImportImageLicenseConfigurationRequestBuilderOps(
      v: ImportImageLicenseConfigurationRequest.Builder
  ): ImportImageLicenseConfigurationRequestBuilderOps = new ImportImageLicenseConfigurationRequestBuilderOps(v)

  implicit def toImportImageLicenseConfigurationRequestOps(
      v: ImportImageLicenseConfigurationRequest
  ): ImportImageLicenseConfigurationRequestOps = new ImportImageLicenseConfigurationRequestOps(v)

}
