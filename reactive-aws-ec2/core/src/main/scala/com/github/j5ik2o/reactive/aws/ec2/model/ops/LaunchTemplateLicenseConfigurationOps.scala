// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateLicenseConfigurationBuilderOps(val self: LaunchTemplateLicenseConfiguration.Builder)
    extends AnyVal {

  final def licenseConfigurationArnAsScala(value: Option[String]): LaunchTemplateLicenseConfiguration.Builder = {
    value.fold(self) { v =>
      self.licenseConfigurationArn(v)
    }
  }

}

final class LaunchTemplateLicenseConfigurationOps(val self: LaunchTemplateLicenseConfiguration) extends AnyVal {

  final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateLicenseConfigurationOps {

  implicit def toLaunchTemplateLicenseConfigurationBuilderOps(
      v: LaunchTemplateLicenseConfiguration.Builder
  ): LaunchTemplateLicenseConfigurationBuilderOps = new LaunchTemplateLicenseConfigurationBuilderOps(v)

  implicit def toLaunchTemplateLicenseConfigurationOps(
      v: LaunchTemplateLicenseConfiguration
  ): LaunchTemplateLicenseConfigurationOps = new LaunchTemplateLicenseConfigurationOps(v)

}
