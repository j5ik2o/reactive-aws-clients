// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyLaunchTemplateRequestBuilderOps(val self: ModifyLaunchTemplateRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): ModifyLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala(value: Option[String]): ModifyLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): ModifyLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionAsScala(value: Option[String]): ModifyLaunchTemplateRequest.Builder = {
    value.fold(self) { v =>
      self.defaultVersion(v)
    }
  }

}

final class ModifyLaunchTemplateRequestOps(val self: ModifyLaunchTemplateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionAsScala: Option[String] = Option(self.defaultVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyLaunchTemplateRequestOps {

  implicit def toModifyLaunchTemplateRequestBuilderOps(
      v: ModifyLaunchTemplateRequest.Builder
  ): ModifyLaunchTemplateRequestBuilderOps = new ModifyLaunchTemplateRequestBuilderOps(v)

  implicit def toModifyLaunchTemplateRequestOps(v: ModifyLaunchTemplateRequest): ModifyLaunchTemplateRequestOps =
    new ModifyLaunchTemplateRequestOps(v)

}
