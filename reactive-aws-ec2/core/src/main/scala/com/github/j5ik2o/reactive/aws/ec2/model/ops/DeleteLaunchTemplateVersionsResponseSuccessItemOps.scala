// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsResponseSuccessItemBuilderOps(
    val self: DeleteLaunchTemplateVersionsResponseSuccessItem.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(
      value: Option[String]
  ): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala(value: Option[Long]): DeleteLaunchTemplateVersionsResponseSuccessItem.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

}

final class DeleteLaunchTemplateVersionsResponseSuccessItemOps(
    val self: DeleteLaunchTemplateVersionsResponseSuccessItem
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
