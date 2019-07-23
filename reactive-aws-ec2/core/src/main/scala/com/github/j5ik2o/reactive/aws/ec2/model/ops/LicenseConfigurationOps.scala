// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LicenseConfigurationBuilderOps(val self: LicenseConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala(value: Option[String]): LicenseConfiguration.Builder = {
    value.fold(self) { v =>
      self.licenseConfigurationArn(v)
    }
  }

}

final class LicenseConfigurationOps(val self: LicenseConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLicenseConfigurationOps {

  implicit def toLicenseConfigurationBuilderOps(v: LicenseConfiguration.Builder): LicenseConfigurationBuilderOps =
    new LicenseConfigurationBuilderOps(v)

  implicit def toLicenseConfigurationOps(v: LicenseConfiguration): LicenseConfigurationOps =
    new LicenseConfigurationOps(v)

}
