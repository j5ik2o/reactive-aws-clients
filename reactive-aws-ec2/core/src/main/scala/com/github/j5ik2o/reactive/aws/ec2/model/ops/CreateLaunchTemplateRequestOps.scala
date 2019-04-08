// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateRequestBuilderOps(val self: CreateLaunchTemplateRequest.Builder) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionDescriptionAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.versionDescription(v)
    }
  }

  final def launchTemplateDataAsScala(value: Option[RequestLaunchTemplateData]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateData(v)
    }
  }

}

final class CreateLaunchTemplateRequestOps(val self: CreateLaunchTemplateRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

  final def launchTemplateDataAsScala: Option[RequestLaunchTemplateData] = Option(self.launchTemplateData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateRequestOps {

  implicit def toCreateLaunchTemplateRequestBuilderOps(
      v: CreateLaunchTemplateRequest.Builder
  ): CreateLaunchTemplateRequestBuilderOps = new CreateLaunchTemplateRequestBuilderOps(v)

  implicit def toCreateLaunchTemplateRequestOps(v: CreateLaunchTemplateRequest): CreateLaunchTemplateRequestOps =
    new CreateLaunchTemplateRequestOps(v)

}
