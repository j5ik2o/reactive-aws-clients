// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateVersionRequestBuilderOps(val self: CreateLaunchTemplateVersionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceVersionAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala(
      value: Option[RequestLaunchTemplateData]
  ): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateData(v)
    }
  }

}

final class CreateLaunchTemplateVersionRequestOps(val self: CreateLaunchTemplateVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceVersionAsScala: Option[String] = Option(self.sourceVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala: Option[RequestLaunchTemplateData] = Option(self.launchTemplateData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateVersionRequestOps {

  implicit def toCreateLaunchTemplateVersionRequestBuilderOps(
      v: CreateLaunchTemplateVersionRequest.Builder
  ): CreateLaunchTemplateVersionRequestBuilderOps = new CreateLaunchTemplateVersionRequestBuilderOps(v)

  implicit def toCreateLaunchTemplateVersionRequestOps(
      v: CreateLaunchTemplateVersionRequest
  ): CreateLaunchTemplateVersionRequestOps = new CreateLaunchTemplateVersionRequestOps(v)

}
