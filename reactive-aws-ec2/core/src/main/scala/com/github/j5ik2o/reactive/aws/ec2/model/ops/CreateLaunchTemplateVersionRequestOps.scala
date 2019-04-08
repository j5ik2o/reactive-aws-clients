// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateVersionRequestBuilderOps(val self: CreateLaunchTemplateVersionRequest.Builder)
    extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def launchTemplateIdAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def sourceVersionAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.sourceVersion(v)
    }
  }

  final def versionDescriptionAsScala(value: Option[String]): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionDescription(v)
    }
  }

  final def launchTemplateDataAsScala(
      value: Option[RequestLaunchTemplateData]
  ): CreateLaunchTemplateVersionRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateData(v)
    }
  }

}

final class CreateLaunchTemplateVersionRequestOps(val self: CreateLaunchTemplateVersionRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def sourceVersionAsScala: Option[String] = Option(self.sourceVersion)

  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

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
