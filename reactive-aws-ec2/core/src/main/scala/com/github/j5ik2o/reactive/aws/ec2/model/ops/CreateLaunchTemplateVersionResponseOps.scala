// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateVersionResponseBuilderOps(val self: CreateLaunchTemplateVersionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateVersionAsScala(
      value: Option[LaunchTemplateVersion]
  ): CreateLaunchTemplateVersionResponse.Builder = {
    value.fold(self) { v =>
      self.launchTemplateVersion(v)
    }
  }

}

final class CreateLaunchTemplateVersionResponseOps(val self: CreateLaunchTemplateVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateVersionAsScala: Option[LaunchTemplateVersion] = Option(self.launchTemplateVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateVersionResponseOps {

  implicit def toCreateLaunchTemplateVersionResponseBuilderOps(
      v: CreateLaunchTemplateVersionResponse.Builder
  ): CreateLaunchTemplateVersionResponseBuilderOps = new CreateLaunchTemplateVersionResponseBuilderOps(v)

  implicit def toCreateLaunchTemplateVersionResponseOps(
      v: CreateLaunchTemplateVersionResponse
  ): CreateLaunchTemplateVersionResponseOps = new CreateLaunchTemplateVersionResponseOps(v)

}
