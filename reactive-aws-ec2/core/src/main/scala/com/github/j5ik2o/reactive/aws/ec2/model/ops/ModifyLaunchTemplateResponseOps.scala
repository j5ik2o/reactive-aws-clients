// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyLaunchTemplateResponseBuilderOps(val self: ModifyLaunchTemplateResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala(value: Option[LaunchTemplate]): ModifyLaunchTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

}

final class ModifyLaunchTemplateResponseOps(val self: ModifyLaunchTemplateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala: Option[LaunchTemplate] = Option(self.launchTemplate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyLaunchTemplateResponseOps {

  implicit def toModifyLaunchTemplateResponseBuilderOps(
      v: ModifyLaunchTemplateResponse.Builder
  ): ModifyLaunchTemplateResponseBuilderOps = new ModifyLaunchTemplateResponseBuilderOps(v)

  implicit def toModifyLaunchTemplateResponseOps(v: ModifyLaunchTemplateResponse): ModifyLaunchTemplateResponseOps =
    new ModifyLaunchTemplateResponseOps(v)

}
