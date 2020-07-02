// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateAndOverridesResponseBuilderOps(val self: LaunchTemplateAndOverridesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateSpecificationAsScala(
      value: Option[FleetLaunchTemplateSpecification]
  ): LaunchTemplateAndOverridesResponse.Builder = {
    value.fold(self) { v => self.launchTemplateSpecification(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala(
      value: Option[FleetLaunchTemplateOverrides]
  ): LaunchTemplateAndOverridesResponse.Builder = {
    value.fold(self) { v => self.overrides(v) }
  }

}

final class LaunchTemplateAndOverridesResponseOps(val self: LaunchTemplateAndOverridesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateSpecificationAsScala: Option[FleetLaunchTemplateSpecification] =
    Option(self.launchTemplateSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def overridesAsScala: Option[FleetLaunchTemplateOverrides] = Option(self.overrides)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateAndOverridesResponseOps {

  implicit def toLaunchTemplateAndOverridesResponseBuilderOps(
      v: LaunchTemplateAndOverridesResponse.Builder
  ): LaunchTemplateAndOverridesResponseBuilderOps = new LaunchTemplateAndOverridesResponseBuilderOps(v)

  implicit def toLaunchTemplateAndOverridesResponseOps(
      v: LaunchTemplateAndOverridesResponse
  ): LaunchTemplateAndOverridesResponseOps = new LaunchTemplateAndOverridesResponseOps(v)

}
