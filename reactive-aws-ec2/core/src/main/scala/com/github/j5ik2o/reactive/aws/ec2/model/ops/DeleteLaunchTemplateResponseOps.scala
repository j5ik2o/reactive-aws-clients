// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateResponseBuilderOps(val self: DeleteLaunchTemplateResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala(value: Option[LaunchTemplate]): DeleteLaunchTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

}

final class DeleteLaunchTemplateResponseOps(val self: DeleteLaunchTemplateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala: Option[LaunchTemplate] = Option(self.launchTemplate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateResponseOps {

  implicit def toDeleteLaunchTemplateResponseBuilderOps(
      v: DeleteLaunchTemplateResponse.Builder
  ): DeleteLaunchTemplateResponseBuilderOps = new DeleteLaunchTemplateResponseBuilderOps(v)

  implicit def toDeleteLaunchTemplateResponseOps(v: DeleteLaunchTemplateResponse): DeleteLaunchTemplateResponseOps =
    new DeleteLaunchTemplateResponseOps(v)

}
