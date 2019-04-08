// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateVersionBuilderOps(val self: LaunchTemplateVersion.Builder) extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionNumberAsScala(value: Option[Long]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.versionNumber(v)
    }
  }

  final def versionDescriptionAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.versionDescription(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def createdByAsScala(value: Option[String]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.createdBy(v)
    }
  }

  final def defaultVersionAsScala(value: Option[Boolean]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.defaultVersion(v)
    }
  }

  final def launchTemplateDataAsScala(value: Option[ResponseLaunchTemplateData]): LaunchTemplateVersion.Builder = {
    value.fold(self) { v =>
      self.launchTemplateData(v)
    }
  }

}

final class LaunchTemplateVersionOps(val self: LaunchTemplateVersion) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionNumberAsScala: Option[Long] = Option(self.versionNumber)

  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def createdByAsScala: Option[String] = Option(self.createdBy)

  final def defaultVersionAsScala: Option[Boolean] = Option(self.defaultVersion)

  final def launchTemplateDataAsScala: Option[ResponseLaunchTemplateData] = Option(self.launchTemplateData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateVersionOps {

  implicit def toLaunchTemplateVersionBuilderOps(v: LaunchTemplateVersion.Builder): LaunchTemplateVersionBuilderOps =
    new LaunchTemplateVersionBuilderOps(v)

  implicit def toLaunchTemplateVersionOps(v: LaunchTemplateVersion): LaunchTemplateVersionOps =
    new LaunchTemplateVersionOps(v)

}
