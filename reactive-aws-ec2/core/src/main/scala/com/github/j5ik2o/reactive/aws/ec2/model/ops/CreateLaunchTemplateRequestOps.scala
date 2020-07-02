// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateRequestBuilderOps(val self: CreateLaunchTemplateRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v => self.launchTemplateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala(value: Option[String]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v => self.versionDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala(value: Option[RequestLaunchTemplateData]): CreateLaunchTemplateRequest.Builder = {
    value.fold(self) { v => self.launchTemplateData(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateLaunchTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateLaunchTemplateRequestOps(val self: CreateLaunchTemplateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionDescriptionAsScala: Option[String] = Option(self.versionDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateDataAsScala: Option[RequestLaunchTemplateData] = Option(self.launchTemplateData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateRequestOps {

  implicit def toCreateLaunchTemplateRequestBuilderOps(
      v: CreateLaunchTemplateRequest.Builder
  ): CreateLaunchTemplateRequestBuilderOps = new CreateLaunchTemplateRequestBuilderOps(v)

  implicit def toCreateLaunchTemplateRequestOps(v: CreateLaunchTemplateRequest): CreateLaunchTemplateRequestOps =
    new CreateLaunchTemplateRequestOps(v)

}
