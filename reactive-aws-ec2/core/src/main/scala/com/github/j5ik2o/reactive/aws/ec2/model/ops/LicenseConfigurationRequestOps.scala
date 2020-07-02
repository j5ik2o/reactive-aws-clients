// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LicenseConfigurationRequestBuilderOps(val self: LicenseConfigurationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala(value: Option[String]): LicenseConfigurationRequest.Builder = {
    value.fold(self) { v => self.licenseConfigurationArn(v) }
  }

}

final class LicenseConfigurationRequestOps(val self: LicenseConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLicenseConfigurationRequestOps {

  implicit def toLicenseConfigurationRequestBuilderOps(
      v: LicenseConfigurationRequest.Builder
  ): LicenseConfigurationRequestBuilderOps = new LicenseConfigurationRequestBuilderOps(v)

  implicit def toLicenseConfigurationRequestOps(v: LicenseConfigurationRequest): LicenseConfigurationRequestOps =
    new LicenseConfigurationRequestOps(v)

}
