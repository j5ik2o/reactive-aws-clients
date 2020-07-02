// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateConfigurationTemplateRequestBuilderOps(val self: CreateConfigurationTemplateRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.applicationName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.templateName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.solutionStackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.platformArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceConfigurationAsScala(
      value: Option[SourceConfiguration]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.sourceConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateConfigurationTemplateRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala(
      value: Option[Seq[ConfigurationOptionSetting]]
  ): CreateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.optionSettings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateConfigurationTemplateRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateConfigurationTemplateRequestOps(val self: CreateConfigurationTemplateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateNameAsScala: Option[String] = Option(self.templateName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceConfigurationAsScala: Option[SourceConfiguration] = Option(self.sourceConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionSettingsAsScala: Option[Seq[ConfigurationOptionSetting]] =
    Option(self.optionSettings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateConfigurationTemplateRequestOps {

  implicit def toCreateConfigurationTemplateRequestBuilderOps(
      v: CreateConfigurationTemplateRequest.Builder
  ): CreateConfigurationTemplateRequestBuilderOps = new CreateConfigurationTemplateRequestBuilderOps(v)

  implicit def toCreateConfigurationTemplateRequestOps(
      v: CreateConfigurationTemplateRequest
  ): CreateConfigurationTemplateRequestOps = new CreateConfigurationTemplateRequestOps(v)

}
