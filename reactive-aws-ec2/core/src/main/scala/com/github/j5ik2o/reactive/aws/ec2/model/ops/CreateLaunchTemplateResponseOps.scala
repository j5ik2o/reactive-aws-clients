// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateResponseBuilderOps(val self: CreateLaunchTemplateResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala(value: Option[LaunchTemplate]): CreateLaunchTemplateResponse.Builder = {
    value.fold(self) { v => self.launchTemplate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def warningAsScala(value: Option[ValidationWarning]): CreateLaunchTemplateResponse.Builder = {
    value.fold(self) { v => self.warning(v) }
  }

}

final class CreateLaunchTemplateResponseOps(val self: CreateLaunchTemplateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala: Option[LaunchTemplate] = Option(self.launchTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def warningAsScala: Option[ValidationWarning] = Option(self.warning)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateResponseOps {

  implicit def toCreateLaunchTemplateResponseBuilderOps(
      v: CreateLaunchTemplateResponse.Builder
  ): CreateLaunchTemplateResponseBuilderOps = new CreateLaunchTemplateResponseBuilderOps(v)

  implicit def toCreateLaunchTemplateResponseOps(v: CreateLaunchTemplateResponse): CreateLaunchTemplateResponseOps =
    new CreateLaunchTemplateResponseOps(v)

}
