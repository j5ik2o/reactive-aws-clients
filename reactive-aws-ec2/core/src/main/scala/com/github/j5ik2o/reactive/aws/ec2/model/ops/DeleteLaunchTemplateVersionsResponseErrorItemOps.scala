// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsResponseErrorItemBuilderOps(
    val self: DeleteLaunchTemplateVersionsResponseErrorItem.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateVersionsResponseErrorItem.Builder = {
    value.fold(self) { v => self.launchTemplateId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): DeleteLaunchTemplateVersionsResponseErrorItem.Builder = {
    value.fold(self) { v => self.launchTemplateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala(value: Option[Long]): DeleteLaunchTemplateVersionsResponseErrorItem.Builder = {
    value.fold(self) { v => self.versionNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseErrorAsScala(
      value: Option[ResponseError]
  ): DeleteLaunchTemplateVersionsResponseErrorItem.Builder = {
    value.fold(self) { v => self.responseError(v) }
  }

}

final class DeleteLaunchTemplateVersionsResponseErrorItemOps(val self: DeleteLaunchTemplateVersionsResponseErrorItem)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseErrorAsScala: Option[ResponseError] = Option(self.responseError)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateVersionsResponseErrorItemOps {

  implicit def toDeleteLaunchTemplateVersionsResponseErrorItemBuilderOps(
      v: DeleteLaunchTemplateVersionsResponseErrorItem.Builder
  ): DeleteLaunchTemplateVersionsResponseErrorItemBuilderOps =
    new DeleteLaunchTemplateVersionsResponseErrorItemBuilderOps(v)

  implicit def toDeleteLaunchTemplateVersionsResponseErrorItemOps(
      v: DeleteLaunchTemplateVersionsResponseErrorItem
  ): DeleteLaunchTemplateVersionsResponseErrorItemOps = new DeleteLaunchTemplateVersionsResponseErrorItemOps(v)

}
