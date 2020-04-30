// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateLicenseConfigurationRequestBuilderOps(val self: LaunchTemplateLicenseConfigurationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def licenseConfigurationArnAsScala(value: Option[String]): LaunchTemplateLicenseConfigurationRequest.Builder = {
            value.fold(self){ v => self.licenseConfigurationArn(v) }
            } 


}

final class LaunchTemplateLicenseConfigurationRequestOps(val self: LaunchTemplateLicenseConfigurationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def licenseConfigurationArnAsScala: Option[String] = Option(self.licenseConfigurationArn) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateLicenseConfigurationRequestOps {

implicit def toLaunchTemplateLicenseConfigurationRequestBuilderOps(v: LaunchTemplateLicenseConfigurationRequest.Builder): LaunchTemplateLicenseConfigurationRequestBuilderOps = new LaunchTemplateLicenseConfigurationRequestBuilderOps(v)

implicit def toLaunchTemplateLicenseConfigurationRequestOps(v: LaunchTemplateLicenseConfigurationRequest): LaunchTemplateLicenseConfigurationRequestOps = new LaunchTemplateLicenseConfigurationRequestOps(v)

}

