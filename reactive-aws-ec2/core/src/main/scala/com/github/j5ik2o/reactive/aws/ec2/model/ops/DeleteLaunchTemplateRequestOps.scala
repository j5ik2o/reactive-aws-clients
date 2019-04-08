// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateRequestBuilderOps(val self: DeleteLaunchTemplateRequest.Builder) extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): DeleteLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

}

final class DeleteLaunchTemplateRequestOps(val self: DeleteLaunchTemplateRequest) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateRequestOps {

  implicit def toDeleteLaunchTemplateRequestBuilderOps(
      v: DeleteLaunchTemplateRequest.Builder
  ): DeleteLaunchTemplateRequestBuilderOps = new DeleteLaunchTemplateRequestBuilderOps(v)

  implicit def toDeleteLaunchTemplateRequestOps(v: DeleteLaunchTemplateRequest): DeleteLaunchTemplateRequestOps =
    new DeleteLaunchTemplateRequestOps(v)

}
