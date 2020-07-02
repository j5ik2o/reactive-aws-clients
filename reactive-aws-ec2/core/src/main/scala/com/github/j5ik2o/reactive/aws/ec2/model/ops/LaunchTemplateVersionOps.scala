// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateVersionBuilderOps(val self: LaunchTemplateVersion.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.launchTemplateId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.launchTemplateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala(value: Option[Long]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.versionNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.versionDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.createTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdByAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.createdBy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionAsScala(value: Option[Boolean]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.defaultVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala(value: Option[ResponseLaunchTemplateData]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v => self.launchTemplateData(v) }
  }

}

final class LaunchTemplateVersionOps(val self: LaunchTemplateVersion) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdByAsScala: Option[String] = Option(self.createdBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionAsScala: Option[Boolean] = Option(self.defaultVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala: Option[ResponseLaunchTemplateData] = Option(self.launchTemplateData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateVersionOps {

  implicit def toLaunchTemplateVersionBuilderOps(v: LaunchTemplateVersion.Builder): LaunchTemplateVersionBuilderOps =
    new LaunchTemplateVersionBuilderOps(v)

  implicit def toLaunchTemplateVersionOps(v: LaunchTemplateVersion): LaunchTemplateVersionOps =
    new LaunchTemplateVersionOps(v)

}
