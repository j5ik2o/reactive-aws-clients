// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsResponseSuccessItemBuilderOps(
    val self: DeleteLaunchTemplateVersionsResponseSuccessItem.Builder
) extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(
      value: Option[String]
  ): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionNumberAsScala(value: Option[Long]): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

}

final class DeleteLaunchTemplateVersionsResponseSuccessItemOps(
    val self: DeleteLaunchTemplateVersionsResponseSuccessItem
) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateVersionsResponseSuccessItemOps {

  implicit def toDeleteLaunchTemplateVersionsResponseSuccessItemBuilderOps(
      v: DeleteLaunchTemplateVersionsResponseSuccessItem.Builder
  ): DeleteLaunchTemplateVersionsResponseSuccessItemBuilderOps =
    new DeleteLaunchTemplateVersionsResponseSuccessItemBuilderOps(v)

  implicit def toDeleteLaunchTemplateVersionsResponseSuccessItemOps(
      v: DeleteLaunchTemplateVersionsResponseSuccessItem
  ): DeleteLaunchTemplateVersionsResponseSuccessItemOps = new DeleteLaunchTemplateVersionsResponseSuccessItemOps(v)

}
